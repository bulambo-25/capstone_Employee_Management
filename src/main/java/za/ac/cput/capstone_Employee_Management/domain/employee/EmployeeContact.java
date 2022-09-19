package za.ac.cput.capstone_Employee_Management.domain.employee;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/*
EmployeeContact.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date April 9 2022
 */
@Entity
@Table(name = "Employee_Contact")
@IdClass(EmployeeContact.EmployeeContactID.class)
public class EmployeeContact implements Serializable {

    @Id @NotNull

    private Long employeeId,contactId;

    protected EmployeeContact() {
    }

    private EmployeeContact(Builder builder) {
        this.employeeId = builder.employeeId;
        this.contactId = builder.contactId;

    }

    public Long getEmployeeId() {
        return employeeId;
    }


    public Long getContactId() {
        return contactId;
    }



    @Override
    public String toString() {
        return "EmployeeContact{" +
                "employeeId='" + employeeId + '\'' +
                ", contactId='" + contactId + '\'' +
                '}';
    }


       public static class EmployeeContactID implements Serializable{

        private Long employeeId, contactId;

    public EmployeeContactID(Long employeeID, Long contactID) {
        this.employeeId = employeeID;
        this.contactId = contactID;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Long getContactId() {
        return contactId;
    }

    protected EmployeeContactID() {
    }
}

    public static class Builder {
        private Long employeeId;
        private Long contactId;


        public Builder setEmployeeId(Long employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }



        public Builder copy(EmployeeContact empCnt) {
            this.employeeId = empCnt.employeeId;
            this.contactId = empCnt.contactId;

            return this;
        }

        public EmployeeContact build() {
            return new EmployeeContact(this);
        }
    }
}
