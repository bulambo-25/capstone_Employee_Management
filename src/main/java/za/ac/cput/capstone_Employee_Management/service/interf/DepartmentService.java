package za.ac.cput.capstone_Employee_Management.service.interf;


import za.ac.cput.capstone_Employee_Management.domain.Department;


import java.util.List;

public interface DepartmentService extends IService<Department,Long> {
    List<Department> findAll();
    void deleteByID(Long deptId);
    //List<Department> findByDeptName(String deptName);
}