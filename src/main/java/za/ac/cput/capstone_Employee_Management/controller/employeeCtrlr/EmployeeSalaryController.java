package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;
/*
 Author: Taariq Khan (219231141)
 Date: September 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.api.EmployeeSalaryApi;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeSalary;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeSalaryService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("employee-management/employeeSalary/")
public class EmployeeSalaryController
{
    final EmployeeSalaryService employeeSalaryService;

    final EmployeeSalaryApi employeeSalaryApi;

    @Autowired
    public EmployeeSalaryController(EmployeeSalaryService employeeSalaryService, EmployeeSalaryApi employeeSalaryApi) {
        this.employeeSalaryService = employeeSalaryService;
        this.employeeSalaryApi = employeeSalaryApi;
    }

    @PostMapping("save")
    public ResponseEntity<EmployeeSalary> save(@RequestBody @Valid EmployeeSalary employeeSalary) {
        EmployeeSalary save = employeeSalaryApi.save(employeeSalary);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{ID}")
    public ResponseEntity<EmployeeSalary> read(@PathVariable EmployeeSalary.EmployeeSalaryID ID) {
        EmployeeSalary read = employeeSalaryService.read(ID)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> delete(@PathVariable EmployeeSalary.EmployeeSalaryID ID){
        this.employeeSalaryService.deleteById(ID);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("delete")
    public ResponseEntity <Void> delete (EmployeeSalary employeeSalary)
    {
        this.employeeSalaryService.delete(employeeSalary);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("getAll")
    public ResponseEntity<List<EmployeeSalary>> findAll()
    {
        List<EmployeeSalary> employeeSalaryList = employeeSalaryService.findAll();
        return ResponseEntity.ok(employeeSalaryList);

    }
}
