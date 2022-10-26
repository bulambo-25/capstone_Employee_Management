package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeRole;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.EmployeeLeaveRepository;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.EmployeeRoleRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeLeaveService;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeRoleService;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeRoleServiceImpl implements EmployeeRoleService {
    final EmployeeRoleRepository employeeRoleRepository;
    @Autowired
    public EmployeeRoleServiceImpl(EmployeeRoleRepository employeeRoleRepository) {
        this.employeeRoleRepository = employeeRoleRepository;
    }


    @Override
    public EmployeeRole save(EmployeeRole employeeRole) {
        return employeeRoleRepository.save(employeeRole);
    }

    @Override
    public Optional<EmployeeRole> read(EmployeeRole.EmployeeRoleID employeeRoleID) {
        return employeeRoleRepository.findById(employeeRoleID);
    }

    @Override
    public void update(EmployeeRole.EmployeeRoleID employeeRoleID, EmployeeRole obj) {

    }

    @Override
    public void delete(EmployeeRole employeeRole) {
        employeeRoleRepository.delete(employeeRole);
    }


    @Override
    public void deleteById(EmployeeRole.EmployeeRoleID ID) {

        employeeRoleRepository.deleteById(ID);

    }

    @Override
    public List<EmployeeRole> findAll() {
        return employeeRoleRepository.findAll();
    }

}
