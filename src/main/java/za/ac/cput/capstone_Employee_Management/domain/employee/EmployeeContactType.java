package za.ac.cput.capstone_Employee_Management.domain.employee;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.domain.compositeID.EmployeeContactId;

import javax.persistence.*;
@NoArgsConstructor
@Data
@Entity
@Getter
public class EmployeeContactType {
    @EmbeddedId
    EmployeeContactId ID;
    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employee_Id")
    private  Employee employee;
    @ManyToOne
    @MapsId("employeeContactId")
    @JoinColumn(name = "contactType_Id")
    private ContactType contactType;


    public EmployeeContactType(Employee employee, ContactType contactType) {
        this.ID = new EmployeeContactId(employee.getEmployeeId(),contactType.getContactId());
        this.employee = employee;
        this.contactType = contactType;
    }


}
