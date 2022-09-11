package za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {
    void deleteByEmployeeId(String Id);


}
