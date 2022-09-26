package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.api.EmployeeAddressAPI;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeAddressIm;

/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("employee-management/EmployeeAddress")
@AllArgsConstructor
public class EmployeeAddressController {

    private EmployeeAddressAPI employeeAddressImApi;
    private EmployeeAddressIm service;

    @PostMapping("/save")
    public ResponseEntity<EmployeeAddress> save(@RequestBody @Valid EmployeeAddress employeeGender)
    {
        System.out.println("save"+employeeGender);
        EmployeeAddress save= this.employeeAddressImApi.save(employeeGender);
        return  ResponseEntity.ok(save);
    }
    @GetMapping("/read/{id}")
    public ResponseEntity<EmployeeAddress> read(@PathVariable EmployeeAddress.EmployeeAddressId id) {
        EmployeeAddress read=this.service.read(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }
    @GetMapping("/All")
    public ResponseEntity<List<EmployeeAddress>> findALL(){

        List<EmployeeAddress> address= this.service.findAll();
        return ResponseEntity.ok(address);
    }
}
