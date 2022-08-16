package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.helper.Helper;

public class EmployeeFactory {

    public  static Employee build( String firstname,String middleName,String lastName){
        String employeeID=Helper.generateID();
        Helper.checkStringPara("employeeID:",employeeID);
        Helper.checkStringPara("firstname",firstname);
        Helper.checkStringPara("lastName",lastName);

        return new Employee.Builder()
                .setEmployeeId(employeeID)
                .setFirstName(firstname)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
    }
}
