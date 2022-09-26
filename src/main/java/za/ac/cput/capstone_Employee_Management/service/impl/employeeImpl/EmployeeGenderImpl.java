package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeGender;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.EmployeeGenderRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeGenderService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
@Service
@Transactional
@AllArgsConstructor
public class EmployeeGenderImpl implements EmployeeGenderService {

    protected EmployeeGenderRepository repository;


    @Override
    public EmployeeGender save(EmployeeGender employeeGender) {

        return  this.repository.save(employeeGender);
    }

    @Override
    public Optional<EmployeeGender> read(EmployeeGender.EmployeeGenderID employeeGenderID) {
        return this.repository.findById(employeeGenderID);
    }

    @Override
    public void delete(EmployeeGender employeeGender) {
        this.repository.delete(employeeGender);
    }

    @Override
    public List<EmployeeGender> findAll() {
        this.repository.findAll();
        return  this.repository.findAll();
    }


}
