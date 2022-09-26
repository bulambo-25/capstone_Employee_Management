package za.ac.cput.capstone_Employee_Management.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import za.ac.cput.capstone_Employee_Management.domain.Department;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class DepartmentFactoryTest {
    Department dep;
    @Test
    void buildWithSuccess() {
        dep =DepartmentFactory.build("IT_Dep", "design&code");
        log.info("Department", dep);
        assertNotNull(dep);
    }

    @Test
    void buildWithErrors() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()
                -> DepartmentFactory.build( "", "design&code"));
        assertEquals("Invalid Value for:deptName: ", exception.getMessage()) ;



    }

}
