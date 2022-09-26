package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;

public interface EmployeeAddressService extends IService<EmployeeAddress ,EmployeeAddress.EmployeeAddressId> {
    List<EmployeeAddress> findAll();
}
