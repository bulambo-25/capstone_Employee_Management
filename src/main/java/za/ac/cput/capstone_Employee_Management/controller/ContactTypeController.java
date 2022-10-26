package za.ac.cput.capstone_Employee_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.service.impl.ContactTypeServiceImpl;

import javax.validation.Valid;
import java.util.List;
/*
ContactType.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date 19 Sep 2022
 */
@Controller
@RequestMapping("employee-management/contactType/")
public class ContactTypeController {
    final ContactTypeServiceImpl contactTypeService;

    @Autowired
    public ContactTypeController(ContactTypeServiceImpl contactTypeService) {
        this.contactTypeService = contactTypeService;
    }

    @PostMapping("save")
    public ResponseEntity<ContactType> save(@RequestBody  ContactType contactType) {
        ContactType save = contactTypeService.save(contactType);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{ID}")
    public ResponseEntity<ContactType> read(@PathVariable Long ID) {
        ContactType read = contactTypeService.read(ID)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }
    @PutMapping("update/{id}")
    public  ResponseEntity update(@PathVariable  Long id,@RequestBody ContactType contactType ){
        contactTypeService.update(id, contactType);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("findByEmail/{email}")
    public ResponseEntity<ContactType> read(@PathVariable String email) {
        ContactType findByEmail = contactTypeService.findByEmail(email);
        return ResponseEntity.ok(findByEmail);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(ContactType contactType) {
        this.contactTypeService.delete(contactType);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> delete(@PathVariable Long ID) {
        this.contactTypeService.deleteByID(ID);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("getAll")
    public ResponseEntity<List<ContactType>> findAll(){
        List<ContactType> contList=contactTypeService.findAll();
        return ResponseEntity.ok(contList);
    }
}
