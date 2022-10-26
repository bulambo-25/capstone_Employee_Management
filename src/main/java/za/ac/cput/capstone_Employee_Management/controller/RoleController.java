package za.ac.cput.capstone_Employee_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.domain.Leaves;
import za.ac.cput.capstone_Employee_Management.domain.Role;
import za.ac.cput.capstone_Employee_Management.service.impl.ContactTypeServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.RoleServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.interf.LeaveService;
import za.ac.cput.capstone_Employee_Management.service.interf.RoleService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("employee-management/role/")
public class RoleController {
    final RoleServiceImpl roleService;

    @Autowired
    public RoleController(RoleService roleService){
        this.roleService= (RoleServiceImpl) roleService;
    }
    @PostMapping("save")
    public ResponseEntity<Role> save(@RequestBody @Valid Role role){
        Role save=roleService.save(role);
        return ResponseEntity.ok(save);
    }
    @GetMapping("read/{ID}")
    public ResponseEntity<Role> read(@PathVariable Long ID){
        Role role= this.roleService.read(ID).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(role);
    }
    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(Role role) {
        this.roleService.delete(role);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("deleteById/{ID}")
    public ResponseEntity<Void> delete(@PathVariable Long ID) {
        this.roleService.deleteByroleId(ID);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Role>> findAll(){
        List<Role> role= this.roleService.findAll();
        return ResponseEntity.ok(role);
    }
}
