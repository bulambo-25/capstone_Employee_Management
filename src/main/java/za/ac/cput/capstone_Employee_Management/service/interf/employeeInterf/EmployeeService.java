package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;

public interface EmployeeService  extends IService<Employee,String> {
    List<Employee> findAll();
    void deleteByEmployeeId(String ID);
}
