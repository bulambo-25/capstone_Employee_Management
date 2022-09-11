package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("employee-management/employee/")
public class EmployeeController {
    final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("save")
    public ResponseEntity<Employee> save(@RequestBody @Valid Employee employee) {
        Employee save = employeeService.save(employee);
        return ResponseEntity.ok(save);
    }

    @PutMapping("read/{ID}")
    public ResponseEntity<Employee> read(@PathVariable String ID) {
        Employee read = employeeService.read(ID)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }
    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(Employee employee) {
        this.employeeService.delete(employee);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> deleteById(@PathVariable String ID) {
        this.employeeService.deleteByEmployeeId(ID);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("getAll")
    public ResponseEntity<List<Employee>> findAll(){
        List<Employee> contList=employeeService.findAll();
        return ResponseEntity.ok(contList);
    }

}