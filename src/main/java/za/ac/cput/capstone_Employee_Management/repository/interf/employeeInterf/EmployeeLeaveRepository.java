package za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;

/*
EMPLOYEE_LEAVE_REPOSITORY.Interface
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */

@Repository
public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeave, EmployeeLeave.EmployeeLeaveID> {

}
