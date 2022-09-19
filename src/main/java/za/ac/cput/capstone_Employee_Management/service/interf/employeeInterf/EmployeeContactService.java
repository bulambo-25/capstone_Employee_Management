package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;

public interface EmployeeContactService extends IService<EmployeeContact, EmployeeContact.EmployeeContactID> {
    List<EmployeeContact> findAll();
    //void deleteByEmployeeId(String ID);
}
