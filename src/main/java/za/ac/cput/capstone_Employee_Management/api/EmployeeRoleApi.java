package za.ac.cput.capstone_Employee_Management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeRole;
import za.ac.cput.capstone_Employee_Management.service.interf.RoleService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeRoleService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeService;

@Component
public class EmployeeRoleApi {
    final EmployeeService employeeService;
    final RoleService roleService;
    final EmployeeRoleService employeeRoleService;

    @Autowired
    public EmployeeRoleApi(EmployeeService employeeService, RoleService roleService, EmployeeRoleService employeeRoleService) {
        this.employeeService = employeeService;
        this.roleService = roleService;
        this.employeeRoleService = employeeRoleService;
    }
    //fix save
    public EmployeeRole save(EmployeeRole employeeRole) {
        employeeService.read(employeeRole.getEmployeeId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee does not  exist"));
        roleService.read((employeeRole.getRoleId())).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Leave does not exits"));
        return employeeRoleService.save(employeeRole);
    }
}
