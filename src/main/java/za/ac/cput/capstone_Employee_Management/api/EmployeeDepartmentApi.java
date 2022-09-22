package za.ac.cput.capstone_Employee_Management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeDepartment;
import za.ac.cput.capstone_Employee_Management.service.interf.ContactTypeService;
import za.ac.cput.capstone_Employee_Management.service.interf.DepartmentService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeContactService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeDepartmentService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeService;


@Component
public class EmployeeDepartmentApi {

    final EmployeeService employeeService;
    final DepartmentService departmentService;
    final EmployeeDepartmentService employeeDepartmentService;

    @Autowired
    public EmployeeDepartmentApi(EmployeeService employeeService, DepartmentService departmentService, EmployeeDepartmentService employeeDepartmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
        this.employeeDepartmentService = employeeDepartmentService;
    }
//fix save
    public EmployeeDepartment save(EmployeeDepartment employeeDepartment) {
        employeeService.read(employeeDepartment.getEmployeeId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee does not  exist"));
        departmentService.read(employeeDepartment.getDeptId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Department does not exits"));
        return employeeDepartmentService.save(employeeDepartment);
    }
}