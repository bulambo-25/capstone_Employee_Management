package za.ac.cput.capstone_Employee_Management.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class EmployeeContactFactoryTest {
    EmployeeContact empConct;
    @Test
    void createEmployeeContact() {
        empConct = EmployeeContactFactory.build("220145547", "22345543");
        log.info("EmployeeContact", empConct);
        assertNotNull(empConct);
    }

    @Test
    void createEmployeeContactWithError() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> EmployeeContactFactory.build( "", "22345543"));
        assertEquals("Invalid Value for:employeeId", exception.getMessage());

    }


}