package za.ac.cput.capstone_Employee_Management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeSalary;
import za.ac.cput.capstone_Employee_Management.service.interf.SalaryService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeSalaryService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeService;

@Component
public class EmployeeSalaryApi
{

    final EmployeeService employeeService;
    final SalaryService salaryService;
    final EmployeeSalaryService employeeSalaryService;

    @Autowired
    public EmployeeSalaryApi(EmployeeService employeeService, SalaryService salaryService, EmployeeSalaryService employeeSalaryService )
    {
        this.employeeService = employeeService;
        this.salaryService = salaryService;
        this.employeeSalaryService = employeeSalaryService;
    }

    public EmployeeSalary save (EmployeeSalary employeeSalary)
    {
        employeeService.read(employeeSalary.getEmployeeId()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Employee does not  exist"));
        salaryService.read(employeeSalary.getSalaryId()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Salary does not exits"));
        return employeeSalaryService.save(employeeSalary);
    }

}
