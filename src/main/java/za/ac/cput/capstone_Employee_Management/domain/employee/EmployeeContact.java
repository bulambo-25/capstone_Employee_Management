package za.ac.cput.capstone_Employee_Management.domain.employee;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/*
EmployeeContact.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */
@Entity
@Table(name = "Employee_Contact")
public class EmployeeContact implements Serializable {
    @Id
    @NotNull
    @Column(name = "employee_Conatct_ID")
    private String employeeContactId;
    @Column(name = "employee_ID")
    private String employeeId;
    @Column(name = "contact_ID")
    private String contactId;



    protected EmployeeContact() {
    }

    private EmployeeContact(Builder builder) {
        this.employeeId = builder.employeeId;
        this.contactId = builder.contactId;
        this.employeeContactId = builder.employeeContactId;
    }

    public String getEmployeeId() {
        return employeeId;
    }


    public String getContactId() {
        return contactId;
    }

    public String getEmployeeContactId() {
        return employeeContactId;
    }

    @Override
    public String toString() {
        return "EmployeeContact{" +
                "employeeId='" + employeeId + '\'' +
                ", contactId='" + contactId + '\'' +
                '}';
    }

    public static class Builder {
        private String employeeId;
        private String contactId;
        private String employeeContactId;

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder setEmployeeContactId(String employeeContactId) {
            this.employeeContactId = employeeContactId;
            return this;
        }

        public Builder copy(EmployeeContact empCnt) {
            this.employeeId = empCnt.employeeId;
            this.contactId = empCnt.contactId;
            this.employeeContactId = empCnt.employeeContactId;
            return this;
        }

        public EmployeeContact build() {
            return new EmployeeContact(this);
        }
    }
}
