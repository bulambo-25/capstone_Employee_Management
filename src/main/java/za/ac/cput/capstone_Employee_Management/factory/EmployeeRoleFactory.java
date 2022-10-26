package za.ac.cput.capstone_Employee_Management.factory;


import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeRole;

public class EmployeeRoleFactory {
    public  static EmployeeRole build(Long employeeId, Long roleId){

        return new EmployeeRole.Builder()
                .setEmployeeId(employeeId).setRoleId(roleId).build();

    }
}
