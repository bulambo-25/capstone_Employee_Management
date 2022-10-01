package za.ac.cput.capstone_Employee_Management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.service.interf.LeaveService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeLeaveService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeService;


/*
EMPLOYEE_LEAVE_API.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */
@Component
public class EmployeeLeaveApi {

    final EmployeeService employeeService;
    final LeaveService leaveService;
    final EmployeeLeaveService employeeLeaveService;

    @Autowired
    public EmployeeLeaveApi(EmployeeService employeeService, LeaveService leaveService, EmployeeLeaveService employeeLeaveService) {
        this.employeeService = employeeService;
        this.leaveService = leaveService;
        this.employeeLeaveService = employeeLeaveService;
    }
    //fix save
    public EmployeeLeave save(EmployeeLeave employeeLeave) {
        employeeService.read(employeeLeave.getEmployeeId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee does not  exist"));
        leaveService.read((employeeLeave.getLeaveId())).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Leave does not exits"));
        return employeeLeaveService.save(employeeLeave);
    }
}