package za.ac.cput.capstone_Employee_Management.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.Department;
import za.ac.cput.capstone_Employee_Management.service.impl.DepartmentServiceImpl;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("employee-management/department/")
public class DepartmentController {
    final DepartmentServiceImpl departmentService;

    @Autowired
    public DepartmentController(DepartmentServiceImpl departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("save")
    public ResponseEntity<Department> save(@RequestBody @Valid Department department) {
        Department save = departmentService.save(department);
        return ResponseEntity.ok(save);
    }

    @PutMapping("read/{ID}")
    public ResponseEntity<Department> read(@PathVariable Long ID) {
        Department read = departmentService.read(ID)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(Department department) {
        this.departmentService.delete(department);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> delete(@PathVariable Long ID) {
        this.departmentService.deleteByID(ID);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Department>> findAll(){
        List<Department> contList=departmentService.findAll();
        return ResponseEntity.ok(contList);
    }

}