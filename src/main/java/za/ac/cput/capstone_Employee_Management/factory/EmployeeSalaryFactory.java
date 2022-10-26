package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeSalary;
import za.ac.cput.capstone_Employee_Management.helper.Helper;

public class EmployeeSalaryFactory
{
    public static EmployeeSalary build(Long employeeId, Long salaryId)
    {
        Helper.checkStringPara("employeeId:", String.valueOf(employeeId));
        Helper.checkStringPara("salaryId", String.valueOf(salaryId));
        return new EmployeeSalary.Builder()
                    .setEmployeeId(employeeId)
                    .setSalaryId(salaryId)
                    .build();
    }
}
