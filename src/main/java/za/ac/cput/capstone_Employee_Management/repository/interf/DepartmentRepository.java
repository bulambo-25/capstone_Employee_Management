package za.ac.cput.capstone_Employee_Management.repository.interf;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.Department;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    List<Department> findDepartmentByDeptNameIgnoreCase(String deptName);
}
