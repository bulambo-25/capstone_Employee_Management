package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.compositeID.EmployeeContactId;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeContactService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("employee-management/employeeContact/")
public class EmployeeContactController {

    final EmployeeContactService employeeContactService;

    @Autowired
    public EmployeeContactController(EmployeeContactService employeeContactService) {
        this.employeeContactService = employeeContactService;
    }

    @PostMapping("save")
    public ResponseEntity<EmployeeContact> save(@RequestBody @Valid EmployeeContact employeeContact) {
        EmployeeContact save = employeeContactService.save(employeeContact);
        return ResponseEntity.ok(save);
    }
    @PutMapping("read/{ID}")
    public ResponseEntity<EmployeeContact> read(@PathVariable EmployeeContactId ID) {
        EmployeeContact read = employeeContactService.read(ID)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }
    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(EmployeeContact employeeContact) {
        this.employeeContactService.delete(employeeContact);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("getAll")
    public ResponseEntity<List<EmployeeContact>> findAll(){
        List<EmployeeContact> contList=employeeContactService.findAll();
        return ResponseEntity.ok(contList);
    }
}
