package za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;

import java.util.List;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
public interface GenderRepository extends JpaRepository<Gender,Long> {
    List<Gender>  findAllByDescriptionContaining(String text);

    @Query("select genderId from Gender ")
    List<Long> findAllIds();

}
