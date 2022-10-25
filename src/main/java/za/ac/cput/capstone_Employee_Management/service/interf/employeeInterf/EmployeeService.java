package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;

import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;

public interface EmployeeService  extends IService<Employee,Long> {
    List<Employee> findAll();
    void deleteByEmployeeId(Long ID);
    List<Employee> findByName(String name);



}
