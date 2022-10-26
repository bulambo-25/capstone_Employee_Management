package za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeRole;
@Repository
public interface EmployeeRoleRepository extends JpaRepository<EmployeeRole, EmployeeRole.EmployeeRoleID> {
}
