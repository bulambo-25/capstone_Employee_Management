package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;

import lombok.AllArgsConstructor;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.api.EmployeeGenderApi;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeGender;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeGenderImpl;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("employee-management/EmployeeGender")
@AllArgsConstructor
public class EmployeeGenderController {

    private EmployeeGenderApi employeeGenderApi;
    private EmployeeGenderImpl service;

    @PostMapping("/save")
    public ResponseEntity<EmployeeGender> save(@RequestBody @Valid EmployeeGender employeeGender)
    {
        System.out.println("save"+employeeGender);
        EmployeeGender save= this.employeeGenderApi.save(employeeGender);
        return  ResponseEntity.ok(save);
    }
    @GetMapping("/read/{id}")
    public ResponseEntity<EmployeeGender> read(@PathVariable EmployeeGender.EmployeeGenderID id) {
        EmployeeGender read=this.service.read(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }
    @GetMapping("/All")
    public ResponseEntity<List<EmployeeGender>> findALL(){

        List<EmployeeGender> addressType= this.service.findAll();
        return ResponseEntity.ok(addressType);
    }
    @DeleteMapping("/delete")
    public  ResponseEntity<Void> delete(EmployeeGender employeeGender)
    {
        this.service.delete(employeeGender);

        return  ResponseEntity.noContent().build();
    }

}
