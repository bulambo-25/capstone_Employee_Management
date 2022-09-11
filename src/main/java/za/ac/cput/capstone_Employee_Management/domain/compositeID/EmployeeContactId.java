package za.ac.cput.capstone_Employee_Management.domain.compositeID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EmployeeContactId implements Serializable {
   @Column(name="employee_Id") private String employeeId;
    @Column (name ="employeeContact_Id")private String employeeContactId;


}
