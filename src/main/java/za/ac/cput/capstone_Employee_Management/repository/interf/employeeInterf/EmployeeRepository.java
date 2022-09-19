package za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;

import java.util.List;
import java.util.Optional;
/*
ContactType.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date 19 Sep 2022
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findEmployeeByLastNameIgnoreCase(String name );

}
