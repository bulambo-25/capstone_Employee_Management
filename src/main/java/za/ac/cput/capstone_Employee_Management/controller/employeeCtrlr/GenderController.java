package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.AddressType;
import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.GenderServiceImpl;

import javax.validation.Valid;
import java.util.List;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
@RestController
@RequestMapping("employee-management/gender")
public class GenderController {

    private GenderServiceImpl service;
    @Autowired
    public GenderController(GenderServiceImpl service)
    {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<Gender> save(@RequestBody @Valid Gender gender)
    {
        System.out.println("save"+gender);
        Gender save= this.service.save(gender);
        return  ResponseEntity.ok(save);
    }
    @GetMapping("/read/{id}")
    public ResponseEntity<Gender> read(@PathVariable  Long id) {
        Gender read=this.service.read(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }

    @PutMapping("update/{id}")
    public  ResponseEntity update(@PathVariable  Long id,@RequestBody Gender gender ){
        service.update(id, gender);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/All")
    public ResponseEntity<List<Gender>> findALL(){

        List<Gender> addressType= this.service.findAll();
        return ResponseEntity.ok(addressType);
    }
    @DeleteMapping("/delete")
    public  ResponseEntity<Void> delete(Gender gender)
    {
        this.service.delete(gender);

        return  ResponseEntity.noContent().build();
    }
    @GetMapping("/AllContaining/{text}")
    public ResponseEntity<List<Gender>>findAllContaining(@PathVariable String text){

        List<Gender> aressType=  this.service.findAllDescription(text);
        return ResponseEntity.ok(aressType);
    }

}
