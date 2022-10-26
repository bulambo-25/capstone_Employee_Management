package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeDepartment;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeDepartmentFactory;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.EmployeeDepartmentRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeDepartmentService;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeDepartmentServiceImpl implements EmployeeDepartmentService {
    final EmployeeDepartmentRepository employeeDepartmentRepository;
    @Autowired
    public EmployeeDepartmentServiceImpl(EmployeeDepartmentRepository employeeDepartmentRepository) {
        this.employeeDepartmentRepository = employeeDepartmentRepository;
    }

    @Override
    public EmployeeDepartment save(EmployeeDepartment employeeDepartment) {
        EmployeeDepartment employeeDepartment2= EmployeeDepartmentFactory.build((Long) employeeDepartment.getEmployeeId(),employeeDepartment.getDeptId());
        return employeeDepartmentRepository.save(employeeDepartment2);
    }

    @Override
    public Optional<EmployeeDepartment> read(EmployeeDepartment.EmployeeDepartmentID integer) {
        return this.employeeDepartmentRepository.findById(integer);
    }

    @Override
    public void update(EmployeeDepartment.EmployeeDepartmentID employeeDepartmentID, EmployeeDepartment obj) {

    }


    @Override
    public void delete(EmployeeDepartment employeeDepartment) {
        employeeDepartmentRepository.delete(employeeDepartment);
    }

    @Override
    public List<EmployeeDepartment> findAll() {
        return employeeDepartmentRepository.findAll();
    }

    @Override
    public void deleteByID(Long deptId) {

    }

    @Override
    public void deleteById(EmployeeDepartment.EmployeeDepartmentID ID) {

        employeeDepartmentRepository.deleteById(ID);

    }
}