package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeGender;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;

public interface EmployeeGenderService extends IService<EmployeeGender,EmployeeGender.EmployeeGenderID> {
    List<EmployeeGender> findAll();

}