package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;
/*
 Author: Taariq Khan (219231141)
 Date: September 2022
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeSalary;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.EmployeeSalaryRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeSalaryService;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeSalaryServiceImpl implements EmployeeSalaryService
{
    final EmployeeSalaryRepository employeeSalaryRepository;

        @Autowired
        public EmployeeSalaryServiceImpl(EmployeeSalaryRepository employeeSalaryRepository)
        {
            this.employeeSalaryRepository = employeeSalaryRepository;
        }

        @Override
        public EmployeeSalary save(EmployeeSalary employeeSalary)
        {
            return employeeSalaryRepository.save(employeeSalary);
        }

        @Override
        public Optional<EmployeeSalary> read(EmployeeSalary.EmployeeSalaryID employeeSalaryID) {
            return employeeSalaryRepository.findById(employeeSalaryID);
        }

        @Override
        public void delete(EmployeeSalary employeeSalary)
        {
            employeeSalaryRepository.delete(employeeSalary);
        }

        @Override
        public void deleteById(EmployeeSalary.EmployeeSalaryID ID)
        {
            employeeSalaryRepository.deleteById(ID);
        }

        @Override
        public List<EmployeeSalary> findAll()
        {
            return employeeSalaryRepository.findAll();
        }


}
