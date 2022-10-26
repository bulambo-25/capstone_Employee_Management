package za.ac.cput.capstone_Employee_Management.controller.employeeCtrlr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.api.EmployeeLeaveApi;
import za.ac.cput.capstone_Employee_Management.api.EmployeeRoleApi;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeRole;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeLeaveService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeRoleService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("employee-management/employeeRole/")
public class EmployeeRoleController {
    final EmployeeRoleService employeeRoleService;
    final EmployeeRoleApi employeeRoleApi;

    @Autowired
    public EmployeeRoleController(EmployeeRoleService employeeRoleService, EmployeeRoleApi employeeRoleApi) {
        this.employeeRoleService = employeeRoleService;
        this.employeeRoleApi = employeeRoleApi;
    }

    @PostMapping("save")
    public ResponseEntity<EmployeeRole> save(@RequestBody @Valid EmployeeRole employeeRole) {
        EmployeeRole save = employeeRoleApi.save(employeeRole);
        return ResponseEntity.ok(save);
    }
    @PutMapping("read/{ID}")
    public ResponseEntity<EmployeeRole> read(@PathVariable EmployeeRole.EmployeeRoleID ID) {
        EmployeeRole read = employeeRoleService.read(ID)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }
    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(EmployeeRole employeeRole) {
        this.employeeRoleService.delete(employeeRole);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> delete(@PathVariable EmployeeRole.EmployeeRoleID ID){
        this.employeeRoleService.deleteById(ID);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("getAll")
    public ResponseEntity<List<EmployeeRole>> findAll(){
        List<EmployeeRole> roleList=employeeRoleService.findAll();
        return ResponseEntity.ok(roleList);
    }
}
