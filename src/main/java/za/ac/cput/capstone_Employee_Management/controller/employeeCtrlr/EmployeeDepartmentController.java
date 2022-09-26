package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import javax.validation.Valid;
import za.ac.cput.capstone_Employee_Management.api.EmployeeDepartmentApi;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeDepartment;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeDepartmentService;

import java.util.List;

@Controller
@RequestMapping("employee-management/employeeDepartment/")
public class EmployeeDepartmentController {

    final EmployeeDepartmentService employeeDepartmentService;
    final EmployeeDepartmentApi employeeDepartmentApi;

    @Autowired
    public EmployeeDepartmentController(EmployeeDepartmentService employeeDepartmentService, EmployeeDepartmentApi employeeDepartmentApi ) {
        this.employeeDepartmentService = employeeDepartmentService;
        this.employeeDepartmentApi = employeeDepartmentApi;
    }

    @PostMapping("save")
    public ResponseEntity<EmployeeDepartment> save(@RequestBody @Valid EmployeeDepartment employeeDepartment) {
        EmployeeDepartment save = employeeDepartmentApi.save(employeeDepartment);
        return ResponseEntity.ok(save);
    }
    @PutMapping("read/{ID}")
    public ResponseEntity<EmployeeDepartment> read(@PathVariable EmployeeDepartment.EmployeeDepartmentID ID) {
        EmployeeDepartment read = employeeDepartmentService.read(ID)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }
    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(EmployeeDepartment employeeDepartment) {
        this.employeeDepartmentService.delete(employeeDepartment);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> delete(@PathVariable EmployeeDepartment.EmployeeDepartmentID ID){
        this.employeeDepartmentService.deleteById(ID);
        return ResponseEntity.noContent().build();
    }



    @GetMapping("getAll")
    public ResponseEntity<List<EmployeeDepartment>> findAll(){
        List<EmployeeDepartment> departmentList=employeeDepartmentService.findAll();
        return ResponseEntity.ok(departmentList);
    }
}

