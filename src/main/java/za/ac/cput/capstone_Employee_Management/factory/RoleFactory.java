package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.Leaves;
import za.ac.cput.capstone_Employee_Management.domain.Role;
import za.ac.cput.capstone_Employee_Management.helper.Helper;

/*
        RoleFactory.java
        Author Reanetsi Sholoko
        Student Number 218160402
        */
public class RoleFactory {


    public  static Role build(Long roleId, String roleName,String roleDesc) {

        return new Role.Builder()
                .setRoleId(roleId).setRoleName(roleName).setRoleDesc(roleDesc).build();
    }
}

