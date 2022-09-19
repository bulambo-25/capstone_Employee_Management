package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
/*
ContactType.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date 19 Sep 2022
 */
public class EmployeeContactFactory {
 public  static EmployeeContact build(Long employeeId, Long contactId){

     return new EmployeeContact.Builder()
             .setEmployeeId(employeeId).setContactId(contactId).build();

  }
}
