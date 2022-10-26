package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.Salary;

public class SalaryFactory
{
    public static Salary build(String salaryAmount, String salaryDescription)
    {
        return new Salary.Builder()
                                    .setSalaryAmount(salaryAmount)
                                    .setSalaryDescription(salaryDescription)
                                    .build();
    }
}





