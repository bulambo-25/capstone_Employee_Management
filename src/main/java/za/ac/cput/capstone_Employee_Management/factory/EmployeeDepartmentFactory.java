package za.ac.cput.capstone_Employee_Management.factory;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeDepartment;

public class EmployeeDepartmentFactory {
    public  static EmployeeDepartment build(Long employeeId, Long deptId){

        return new EmployeeDepartment.Builder()
                .setEmployeeId(employeeId)
                .setDeptId(deptId)
                .build();
    }

    public static EmployeeDepartment createEmployeeDepartment
            ( Long employeeId, Long deptId) {
    return createEmployeeDepartment(employeeId, deptId);
    }
}
