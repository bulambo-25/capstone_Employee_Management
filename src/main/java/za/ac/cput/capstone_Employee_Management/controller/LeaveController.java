package za.ac.cput.capstone_Employee_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.Leaves;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.service.interf.LeaveService;

import javax.validation.Valid;
import java.util.List;

/*
LEAVE_CONTROLLER.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */
@RestController
@RequestMapping("employee-management/leaves/")
public class LeaveController {
    private final LeaveService leaveService;

    @Autowired
    public LeaveController(LeaveService leaveService){
        this.leaveService = leaveService;
    }
    @PostMapping("save")
    public ResponseEntity<Leaves> save(@RequestBody @Valid Leaves leave){
        Leaves save=leaveService.save(leave);
        return ResponseEntity.ok(save);
    }
    @GetMapping("read/{ID}")
    public ResponseEntity<Leaves> read(@PathVariable Long ID){
        Leaves leave= this.leaveService.read(ID).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(leave);
    }

    @PutMapping("update/{id}")
    public  ResponseEntity update(@PathVariable  Long id,@RequestBody Leaves leave ){
        leaveService.update(id, leave);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(Leaves leave) {
        this.leaveService.delete(leave);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> delete(@PathVariable Long ID) {
        this.leaveService.deleteByleaveId(ID);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Leaves>> findAll(){
        List<Leaves> leaves= this.leaveService.findAll();
        return ResponseEntity.ok(leaves);
    }
}