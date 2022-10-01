package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.EmployeeLeaveRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeLeaveService;

import java.util.List;
import java.util.Optional;

/*
EMPLOYEE_LEAVE_SERVICE_IMPL.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */

@Service
public class EmployeeLeaveServiceImpl implements EmployeeLeaveService {
    final EmployeeLeaveRepository employeeLeaveRepository;
    @Autowired
    public EmployeeLeaveServiceImpl(EmployeeLeaveRepository employeeLeaveRepository) {
        this.employeeLeaveRepository = employeeLeaveRepository;
    }


    @Override
    public EmployeeLeave save(EmployeeLeave employeeLeave) {
        return employeeLeaveRepository.save(employeeLeave);
    }

    @Override
    public Optional<EmployeeLeave> read(EmployeeLeave.EmployeeLeaveID employeeLeaveID) {
        return employeeLeaveRepository.findById(employeeLeaveID);
    }

    @Override
    public void delete(EmployeeLeave employeeLeave) {
        employeeLeaveRepository.delete(employeeLeave);
    }


    @Override
    public void deleteById(EmployeeLeave.EmployeeLeaveID ID) {

        employeeLeaveRepository.deleteById(ID);

    }

    @Override
    public List<EmployeeLeave> findAll() {
        return employeeLeaveRepository.findAll();
    }
}
