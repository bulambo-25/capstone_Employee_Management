package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
import za.ac.cput.capstone_Employee_Management.helper.Helper;

public class EmployeeContactFactory {
    public  static EmployeeContact build( String employeeId, String contactId){
        String employeeContactId=Helper.generateID();
        Helper.checkStringPara("employeeContactId",employeeContactId);
        Helper.checkStringPara("employeeId",employeeId);
        Helper.checkStringPara("contactId",contactId);
        return new EmployeeContact.Builder().setEmployeeContactId(employeeContactId)
                .setEmployeeId(employeeId).setContactId(contactId).build();
    }
}
