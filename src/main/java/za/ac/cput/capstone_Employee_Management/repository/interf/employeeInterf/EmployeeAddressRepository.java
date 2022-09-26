package za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, EmployeeAddress.EmployeeAddressId> {
}
