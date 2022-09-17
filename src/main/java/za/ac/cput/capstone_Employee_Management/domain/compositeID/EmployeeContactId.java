package za.ac.cput.capstone_Employee_Management.domain.compositeID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import za.ac.cput.capstone_Employee_Management.helper.Helper;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EmployeeContactId implements Serializable {
   @Column(name="employee_Id") private String employeeId;
    @Column (name ="employeeContact_Id")private String contactId;

    @Override
    public String toString() {
        return "EmployeeContactId{" +
                "employeeId='" + employeeId + '\'' +
                ", contactId='" + contactId + '\'' +
                '}';
    }

    public static void main(String[] args) {
        EmployeeContactId compositeId= EmployeeContactId.builder(). employeeId("").contactId("").build();

    }
}
