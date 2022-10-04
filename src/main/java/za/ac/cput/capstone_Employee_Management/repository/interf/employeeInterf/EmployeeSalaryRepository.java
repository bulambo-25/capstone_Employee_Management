package za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeSalary;

import java.util.Optional;

@Repository
public interface EmployeeSalaryRepository extends JpaRepository<EmployeeSalary, EmployeeSalary.EmployeeSalaryID>
{

}
