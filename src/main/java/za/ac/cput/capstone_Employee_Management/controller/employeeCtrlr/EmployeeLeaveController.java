package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.api.EmployeeContactTypeApi;
import za.ac.cput.capstone_Employee_Management.api.EmployeeLeaveApi;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeLeaveService;

import javax.validation.Valid;
import java.util.List;

/*
EMPLOYEE_LEAVE_CONTROLLER.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */

@Controller
@RequestMapping("employee-management/employeeLeave/")
public class EmployeeLeaveController {

    final EmployeeLeaveService employeeLeaveService;
    final EmployeeLeaveApi employeeLeaveApi;

    @Autowired
    public EmployeeLeaveController(EmployeeLeaveService employeeLeaveService, EmployeeLeaveApi employeeLeaveApi) {
        this.employeeLeaveService = employeeLeaveService;
        this.employeeLeaveApi = employeeLeaveApi;
    }

    @PostMapping("save")
    public ResponseEntity<EmployeeLeave> save(@RequestBody @Valid EmployeeLeave employeeLeave) {
        EmployeeLeave save = employeeLeaveApi.save(employeeLeave);
        return ResponseEntity.ok(save);
    }
    @GetMapping("read/{ID}")
    public ResponseEntity<EmployeeLeave> read(@PathVariable EmployeeLeave.EmployeeLeaveID ID) {
        EmployeeLeave read = employeeLeaveService.read(ID)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }
    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(EmployeeLeave employeeLeave) {
        this.employeeLeaveService.delete(employeeLeave);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> delete(@PathVariable EmployeeLeave.EmployeeLeaveID ID){
        this.employeeLeaveService.deleteById(ID);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("getAll")
    public ResponseEntity<List<EmployeeLeave>> findAll(){
        List<EmployeeLeave> contList=employeeLeaveService.findAll();
        return ResponseEntity.ok(contList);
    }
}
