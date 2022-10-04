package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeSalary;

public class EmployeeSalaryFactory
{
    public static EmployeeSalary build(Long employeeId, Long salaryId)
    {

        return new EmployeeSalary.Builder()
                    .setEmployeeId(employeeId)
                    .setSalaryId(salaryId)
                    .build();
    }
}
