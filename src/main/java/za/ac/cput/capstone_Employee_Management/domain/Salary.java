package za.ac.cput.capstone_Employee_Management.domain;
/* Salary.java
 Entity for the Salary
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
public class Salary
{
    private String salaryId;
    private double salaryAmount;
    private String salaryDescription;
    private Payroll payroll;

    private Salary(Builder builder)
    {
        this.salaryId = builder.salaryId;
        this.salaryAmount = builder.salaryAmount;
        this.salaryDescription = builder.salaryDescription;
    }

    public String getSalaryId()
    {
        return salaryId;
    }

    public void setSalaryId(String salaryId)
    {
        this.salaryId = salaryId;
    }

    public double getSalaryAmount()
    {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount)
    {
        this.salaryAmount = salaryAmount;
    }

    public String getSalaryDescription()
    {
        return salaryDescription;
    }

    public void setSalaryDescription(String salaryDescription)
    {
        this.salaryDescription = salaryDescription;
    }

    public Payroll getPayroll()
    {
        return payroll;
    }

    public void setPayroll(Payroll payroll)
    {
        this.payroll = payroll;
    }

    @Override
    public String toString()
    {
        return "Salary\n" + "Salary Id : " + salaryId + "\nSalary amount : " + salaryAmount + "\nSalary description : " + salaryDescription;
    }
    public static class Builder
    {
        private String salaryId;
        private double salaryAmount;
        private String salaryDescription;

        public Builder setSalaryId(String salaryId)
        {
            this.salaryId = salaryId;
            return this;
        }
        public Builder setSalaryAmount(double salaryAmount)
        {
            this.salaryAmount = salaryAmount;
            return this;
        }
        public Builder setSalaryDescription(String salaryDescription)
        {
            this.salaryDescription = salaryDescription;
            return this;
        }

        public Builder copy(Salary salary)
        {
            this.salaryId = salary.salaryId;
            this.salaryAmount = salary.salaryAmount;
            this.salaryDescription =salary.salaryDescription;
            return this;
        }
        public Salary build()
        {
            return new Salary(this);
        }
    }
}
