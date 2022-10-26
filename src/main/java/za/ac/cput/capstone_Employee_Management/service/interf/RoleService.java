package za.ac.cput.capstone_Employee_Management.service.interf;

import za.ac.cput.capstone_Employee_Management.domain.Leaves;
import za.ac.cput.capstone_Employee_Management.domain.Role;

import java.util.List;

public interface RoleService extends IService<Role,Long> {

    List<Role> findAll();
    void deleteByroleId(Long ID);

    Role findByName(String name);

}
