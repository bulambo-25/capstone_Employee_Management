package za.ac.cput.capstone_Employee_Management.api;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.capstone_Employee_Management.domain.compositeID.EmployeeContactId;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContactType;
import za.ac.cput.capstone_Employee_Management.service.interf.ContactTypeService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeContactService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeService;

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
//
//    public EmployeeContactType save (EmployeeContactId employeeContactId){
//        employeeService.read(employeeContactId.getEmployeeId()).orElseThrow(()->new IllegalArgumentException("No employee Id found"));
//        contactTypeService.read(employeeContactId.getContactId()).orElseThrow(()-> new IllegalStateException("No contact Type Id found"));
//        employeeContactService.save(employeeContactId);
//    }
}
