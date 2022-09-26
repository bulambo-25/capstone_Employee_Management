package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.EmployeeAddressRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeAddressService;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class EmployeeAddressIm implements EmployeeAddressService
{

    private EmployeeAddressRepository repository;


    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        System.out.println(employeeAddress.toString());
        return repository.save(employeeAddress);
    }

    @Override
    public Optional<EmployeeAddress> read(EmployeeAddress.EmployeeAddressId employeeAddressID) {
        return this.repository.findById(employeeAddressID);
    }

    @Override
    public void delete(EmployeeAddress employeeAddress) {


        this.repository.delete(employeeAddress);
    }

    @Override
    public List<EmployeeAddress> findAll() {
        return this.repository.findAll();
    }
}
