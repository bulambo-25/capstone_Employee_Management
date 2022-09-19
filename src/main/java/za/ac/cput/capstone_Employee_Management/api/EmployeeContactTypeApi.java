package za.ac.cput.capstone_Employee_Management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
import za.ac.cput.capstone_Employee_Management.service.interf.ContactTypeService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeContactService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeService;

import java.util.ArrayList;
import java.util.List;

/*
ContactType.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date 19 Sep 2022
 */
@Component
public class EmployeeContactTypeApi {

    final EmployeeService employeeService;
    final ContactTypeService contactTypeService;
    final EmployeeContactService employeeContactService;
@Autowired
    public EmployeeContactTypeApi(EmployeeService employeeService, ContactTypeService contactTypeService, EmployeeContactService employeeContactService) {
        this.employeeService = employeeService;
        this.contactTypeService = contactTypeService;
        this.employeeContactService = employeeContactService;
    }

    public EmployeeContact save (EmployeeContact employeeContact){
       employeeService.read(employeeContact.getEmployeeId()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Employee does not  exist"));
       contactTypeService.read(employeeContact.getContactId()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Contact Type does not exits"));
       return employeeContactService.save(employeeContact);
    }

// public List<String> getEmployeeByEmail( ){
//    List<Employee>empList=employeeService.findAll();
//   empList=new ArrayList<>();
//   List<ContactType> contactTypeList=contactTypeService.findAll();
//ArrayList<String> empName= new ArrayList<>();
//   contactTypeList=new ArrayList<>();
//
//   for(Employee employee: empList){
//       empName.add(employee.getLastName());
//   }
//
// }
}
