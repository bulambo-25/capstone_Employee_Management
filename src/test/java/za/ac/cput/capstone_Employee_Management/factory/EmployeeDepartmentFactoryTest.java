package za.ac.cput.capstone_Employee_Management.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeDepartment;


import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class EmployeeDepartmentFactoryTest {
    EmployeeDepartment empDept;
    @Test
    void buildWithSuccess() {
        empDept = EmployeeDepartmentFactory.build(3749l, 054l);
        log.info("EmployeeDepartment", empDept);
        assertNotNull(empDept);
    }

    @Test
    void buildWithSuccessWithError() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()
                -> EmployeeDepartmentFactory.build( 3749l, 0l));
        assertEquals("Invalid Value for:deptId", exception.getMessage());

    }



}
