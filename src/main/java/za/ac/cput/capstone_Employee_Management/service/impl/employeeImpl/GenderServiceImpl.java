package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.GenderRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.GenderService;

import java.util.List;
import java.util.Optional;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
@Service
public class GenderServiceImpl implements GenderService {

    private GenderRepository repository;
    @Autowired
    public GenderServiceImpl(GenderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Gender save(Gender gender) {
        return this.repository.save(gender);
    }

    @Override
    public Optional<Gender> read(Long integer) {
        return this.repository.findById(integer);
    }

    @Override
    public void delete(Gender gender) {

        this.repository.delete(gender);
    }

    @Override
    public List<Gender>  findAll() {


      return this.repository.findAll();
    }

    public List<Long>  findAllId() {


        return this.repository.findAllIds();
    }

    @Override
    public Optional<Gender> findByGenderId(Long id) {

        return this.repository.findById(id);


    }

    public List<Gender> findAllDescription(String text) {


     List<Gender> des=this.repository.findAllByDescriptionContaining(text);

    return  des;
    }
}
