package za.ac.cput.capstone_Employee_Management.domain.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/* EmployeeSalary.java
 Entity for the EmployeeSalary
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
@Entity
@Table(name = "Employee_Salary")
@IdClass(EmployeeSalary.EmployeeSalaryID.class)
public class EmployeeSalary implements Serializable
{

    @Id @NotNull
    private Long employeeId, salaryId;

    //private constructor
    protected EmployeeSalary()
    {

    }
    private EmployeeSalary(Builder builder)
    {
        this.employeeId = builder.employeeId;
        this.salaryId = builder.salaryId;
    }

    public Long getEmployeeId()
    {
        return employeeId;
    }

    public Long getSalaryId()
    {
        return salaryId;
    }

    @Override
    public String toString()
    {
        return "Employee Salary\n" +
                "\nEmployee Id : " + employeeId +
                "\nSalary Id : " + salaryId;
    }

    public static class EmployeeSalaryID implements Serializable {

        private Long employeeId, salaryId;

        protected EmployeeSalaryID()
        {

        }

        public EmployeeSalaryID(Long employeeId, Long salaryId)
        {
            this.employeeId = employeeId;
            this.salaryId = salaryId;
        }

        public Long getEmployeeId()
        {
            return employeeId;
        }

        public Long getSalaryId()
        {
            return salaryId;
        }

    }

    public static class Builder
    {
        private Long employeeId;
        private Long salaryId;

        public Builder setEmployeeId(Long employeeId)
        {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setSalaryId(Long salaryId)
        {
            this.salaryId = salaryId;
            return this;
        }

        public Builder copy(EmployeeSalary employeeSalary)
        {
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
