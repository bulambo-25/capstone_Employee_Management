package za.ac.cput.capstone_Employee_Management.domain;
/* Payroll.java
 Entity for the Payroll
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
public class Payroll
{
    private String payrollId;
    private double totalPayroll;

    private Payroll(Builder builder)
    {
        this.payrollId = builder.payrollId;
        this.totalPayroll = builder.totalPayroll;
    }

    public String getPayrollId()
    {
        return payrollId;
    }

    public void setPayrollId(String payrollId)
    {
        this.payrollId = payrollId;
    }

    public double getTotalPayroll()
    {
        return totalPayroll;
    }

    public void setTotalPayroll(double totalPayroll)
    {
        this.totalPayroll = totalPayroll;
    }

    @Override
    public String toString()
    {
        return "Payroll\n" + "Payroll Id : " + payrollId + "\nTotal Payroll : " + totalPayroll;
    }

    public static class Builder
    {
        private String payrollId;
        private double totalPayroll;

        public Builder setPayrollId(String payrollId)
        {
            this.payrollId = payrollId;
            return this;
        }
        public Builder setTotalPayroll(double totalPayroll)
        {
            this.totalPayroll = totalPayroll;
            return this;
        }

        public Builder copy(Payroll payroll)
        {
            this.payrollId = payroll.payrollId;
            this.totalPayroll = payroll.totalPayroll;
            return this;
        }
        public Payroll build()
        {
            return new Payroll(this);
        }
    }
}
