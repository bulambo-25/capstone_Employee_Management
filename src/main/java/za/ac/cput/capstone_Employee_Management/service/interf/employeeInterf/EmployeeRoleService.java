package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;



import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeRole;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;

public interface EmployeeRoleService extends IService<EmployeeRole, EmployeeRole.EmployeeRoleID> {
    List<EmployeeRole> findAll();
    void deleteById(EmployeeRole.EmployeeRoleID ID);
}
