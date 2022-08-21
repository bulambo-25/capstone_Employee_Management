package za.ac.cput.capstone_Employee_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.service.impl.ContactTypeServiceImpl;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("employee-management/contactType/")
public class ContactTypeController {
    final ContactTypeServiceImpl contactTypeService;

    @Autowired
    public ContactTypeController(ContactTypeServiceImpl contactTypeService) {
        this.contactTypeService = contactTypeService;
    }

    @PostMapping("save")
    public ResponseEntity<ContactType> save(@RequestBody @Valid ContactType contactType) {
        ContactType save = contactTypeService.save(contactType);
        return ResponseEntity.ok(save);
    }

    @PutMapping("read/{ID}")
    public ResponseEntity<ContactType> read(@PathVariable String ID) {
        ContactType read = contactTypeService.read(ID)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(ContactType contactType) {
        this.contactTypeService.delete(contactType);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> delete(@PathVariable String ID) {
        this.contactTypeService.deleteByID(ID);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("getAll")
    public ResponseEntity<List<ContactType>> findAll(){
        List<ContactType> contList=contactTypeService.findAll();
        return ResponseEntity.ok(contList);
    }
}
