package za.ac.cput.capstone_Employee_Management.domain.employee;
/* EmployeeSalary.java
 Entity for the EmployeeSalary
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
public class EmployeeSalary
{
    private String employeeSalaryId;
    private String employeeId;
    private String salaryId;

    //private constructor
    private EmployeeSalary(Builder builder)
    {
        this.employeeSalaryId = builder.employeeSalaryId;
        this.employeeId = builder.employeeId;
        this.salaryId = builder.salaryId;
    }

    public String getEmployeeSalaryId()
    {
        return employeeSalaryId;
    }

    public void setEmployeeSalaryId(String employeeSalaryId)
    {
        this.employeeSalaryId = employeeSalaryId;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }
    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }
    public String getSalaryId()
    {
        return salaryId;
    }
    public void setSalary(String salaryId)
    {
        this.salaryId = salaryId;
    }

    @Override
    public String toString()
    {
        return "Employee Salary\n" + "Employee Salary Id : " + employeeSalaryId +"\nEmployee Id : " + employeeId +"\nSalary Id : " + salaryId;
    }

    public static class Builder
    {
        private String employeeSalaryId;
        private String employeeId;
        private String salaryId;

        public Builder setEmployeeId(String employeeId)
        {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setSalaryId(String salaryId)
        {
            this.salaryId = salaryId;
            return this;
        }

        public Builder setEmployeeSalaryId(String employeeSalaryId)
        {
            this.employeeSalaryId = employeeSalaryId;
            return this;
        }

        public Builder copy(EmployeeSalary employeeSalary)
        {
            this.employeeSalaryId = employeeSalary.employeeSalaryId;
            this.employeeId = employeeSalary.employeeId;
            this.salaryId = employeeSalary.salaryId;
            return this;
        }

        public EmployeeSalary build()
        {
            return new EmployeeSalary(this);
        }
    }
}
