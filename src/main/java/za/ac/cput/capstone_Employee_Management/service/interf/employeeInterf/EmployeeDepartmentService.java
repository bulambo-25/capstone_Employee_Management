package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeDepartment;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;

public interface EmployeeDepartmentService extends IService<EmployeeDepartment, EmployeeDepartment.EmployeeDepartmentID> {
    List<EmployeeDepartment> findAll();
    //void deleteByEmployeeId(String ID);

    void deleteByID(Long deptId);

    void deleteById(EmployeeDepartment.EmployeeDepartmentID id);

    //void deleteByEmployeeId(int id);
}
