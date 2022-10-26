package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;

/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.AddressType;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.AddressTypeimpl;

import javax.validation.Valid;
import java.util.List;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
@RestController
@RequestMapping("employee-management/AddressType")
public class AddressTypeController {

    private AddressTypeimpl service;

    @Autowired
    public AddressTypeController( AddressTypeimpl service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<AddressType> save(@RequestBody @Valid AddressType addressType)
    {
        System.out.println("save"+addressType);
        AddressType save= this.service.save(addressType);
        return  ResponseEntity.ok(save);
    }
    @GetMapping("/read/{id}")
    public ResponseEntity<AddressType> read(@PathVariable  Long id) {
        AddressType read=this.service.read(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }
    @PutMapping("/update/{id}")
    public  ResponseEntity update(@PathVariable  Long id,@RequestBody AddressType addressType ){
        service.update(id, addressType);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/All")
    public ResponseEntity<List<AddressType>> findALL(){

        List<AddressType> addressType= this.service.findAll();
        return ResponseEntity.ok(addressType);
    }
    @DeleteMapping("/delete")
    public  ResponseEntity<Void> delete(AddressType addressType)
    {
        this.service.delete(addressType);

        return  ResponseEntity.noContent().build();
    }

    @GetMapping("/findByPostalCode/{text}")
    public ResponseEntity<List<AddressType>>findByPostalCode(@PathVariable  String text) {
        List<AddressType> read=this.service.findByPostalCodeOrCity(text);
        return ResponseEntity.ok(read);
    }
}
