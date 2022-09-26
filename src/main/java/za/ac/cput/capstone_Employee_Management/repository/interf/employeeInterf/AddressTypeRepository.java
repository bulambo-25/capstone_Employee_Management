package za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.capstone_Employee_Management.domain.AddressType;

import java.util.List;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
public interface AddressTypeRepository extends JpaRepository<AddressType,Long> {

    List<AddressType> getAddressTypeByPostalCode(String postalCodeOrCity);
    AddressType deleteAddressTypeByAddressTypeId(Long AddressTypeId);
}
