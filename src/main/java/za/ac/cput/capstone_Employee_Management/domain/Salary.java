package za.ac.cput.capstone_Employee_Management.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/* Salary.java
 Entity for the Salary
 Author: Taariq Khan (219231141)
 Date: 2 April 2022*/
@Entity
@Table(name = "Salary")
public class Salary implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "salary_ID")
    private Long salaryId;
    @Column(name = "salary_Amount")
    private String salaryAmount;
    @Column(name = "salary_Description")
    private String salaryDescription;

    protected Salary()
    {

    }
    private Salary(Builder builder)
    {
        this.salaryId = builder.salaryId;
        this.salaryAmount = builder.salaryAmount;
        this.salaryDescription = builder.salaryDescription;
    }

    public Long getSalaryId()
    {
        return salaryId;
    }

    public String getSalaryAmount()
    {
        return salaryAmount;
    }

    public String getSalaryDescription()
    {
        return salaryDescription;
    }

    public void setSalaryDescription(String salaryDescription)
    {
        this.salaryDescription = salaryDescription;
    }

    @Override
    public String toString()
    {
        return "Salary\n" + "Salary Id : " + salaryId + "\nSalary amount : " + salaryAmount + "\nSalary description : " + salaryDescription;
    }
    public static class Builder
    {
        private Long salaryId;
        private String salaryAmount;
        private String salaryDescription;

        public Builder setSalaryId(Long salaryId)
        {
            this.salaryId = salaryId;
            return this;
        }
        public Builder setSalaryAmount(String salaryAmount)
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
