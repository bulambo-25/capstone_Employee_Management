package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;
/*
EMPLOYEE_LEAVE_SERVICE.INTERFACE
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */

public interface EmployeeLeaveService extends IService<EmployeeLeave, EmployeeLeave.EmployeeLeaveID> {
    List<EmployeeLeave> findAll();
    void deleteById(EmployeeLeave.EmployeeLeaveID ID);
}
