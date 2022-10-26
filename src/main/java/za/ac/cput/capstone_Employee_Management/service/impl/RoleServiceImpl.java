package za.ac.cput.capstone_Employee_Management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.Leaves;
import za.ac.cput.capstone_Employee_Management.domain.Role;
import za.ac.cput.capstone_Employee_Management.domain.Salary;
import za.ac.cput.capstone_Employee_Management.factory.LeaveFactory;
import za.ac.cput.capstone_Employee_Management.factory.RoleFactory;
import za.ac.cput.capstone_Employee_Management.repository.interf.LeaveRepository;
import za.ac.cput.capstone_Employee_Management.repository.interf.RoleRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.RoleService;

import java.util.List;
import java.util.Optional;

/*
 RoleServiceImpl.java
 Author Reanetsi Sholoko
 Student Number 218160402
 */

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {

        this.roleRepository = roleRepository;
    }

    @Override
    public Role save(Role role) {
        Role employee2= RoleFactory.build(role.getRoleId(),role.getRoleName(),role.getRoleDesc());

        return this.roleRepository.save(employee2);
    }

    @Override
    public Optional<Role> read(Long Integer) {
        return this.roleRepository.findById(Integer);
    }

    @Override
    public void update(Long aLong, Role obj) {
        List<Role>  list=findAll();
        for( int i=0; i<list.size(); i++) {
            Role employee=list.get(i);
            if (employee.getRoleId().equals(obj.getRoleId())) {
                roleRepository.save(obj);
            }
        }
    }


    @Override
    public void delete(Role role) {
        this.roleRepository.delete(role);
    }


    @Override
    public List<Role> findAll() {
        return this.roleRepository.findAll();
    }

    @Override
    public void deleteByroleId(Long ID) {
        Optional<Role> role = read(ID);
        if (role.isPresent()) delete(role.get());
    }

    @Override
    public Role findByName(String name) {
        return null;
    }


}

