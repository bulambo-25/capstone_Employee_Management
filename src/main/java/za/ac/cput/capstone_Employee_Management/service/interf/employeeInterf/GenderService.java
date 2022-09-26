package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;

import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;
import java.util.Optional;

public interface GenderService extends IService<Gender, Long> {
    List<Gender> findAll();

    Optional<Gender> findByGenderId(Long id);
}
