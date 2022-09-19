package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.helper.Helper;
/*
ContactType.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date 19 Sep 2022
 */
public class EmployeeFactory {

    public  static Employee build( String firstname,String middleName,String lastName){

        Helper.checkStringPara("firstname",firstname);
        Helper.checkStringPara("lastName",lastName);

        return new Employee.Builder()

                .setFirstName(firstname)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
    }
}
