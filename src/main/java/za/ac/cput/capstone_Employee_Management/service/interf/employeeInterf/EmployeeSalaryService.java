package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;
/*
 Author: Taariq Khan (219231141)
 Date: September 2022
 */
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeSalary;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;
import java.util.Optional;

public interface EmployeeSalaryService extends IService<EmployeeSalary, EmployeeSalary.EmployeeSalaryID>
{
    Optional<EmployeeSalary> read(EmployeeSalary.EmployeeSalaryID ID);

    void deleteById(EmployeeSalary.EmployeeSalaryID ID);

    List<EmployeeSalary> findAll();

}