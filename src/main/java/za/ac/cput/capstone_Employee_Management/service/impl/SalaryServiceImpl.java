package za.ac.cput.capstone_Employee_Management.service.impl;
/*
 Author: Taariq Khan (219231141)
 Date: September 2022
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.Salary;
import za.ac.cput.capstone_Employee_Management.factory.SalaryFactory;
import za.ac.cput.capstone_Employee_Management.repository.interf.SalaryRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.SalaryService;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryServiceImpl implements SalaryService
{
    final SalaryRepository salaryRepository;

    @Autowired
    public SalaryServiceImpl(SalaryRepository salaryRepository)
    {
        this.salaryRepository = salaryRepository;
    }

    @Override
    public List<Salary> findAll()
    {
        return salaryRepository.findAll();
    }

    @Override
    public void deleteByID(Long ID)
    {
        salaryRepository.deleteById(ID);
    }

    @Override
    public Salary save(Salary salary)
    {
        Salary salary2 = SalaryFactory.build(salary.getSalaryAmount(), salary.getSalaryDescription());
        return salaryRepository.save(salary2);
    }

    @Override
    public Optional <Salary> read (Long ID)
    {
        return salaryRepository.findById(ID);
    }

    @Override
    public void delete(Salary salary)
    {
        salaryRepository.delete(salary);
    }

}
