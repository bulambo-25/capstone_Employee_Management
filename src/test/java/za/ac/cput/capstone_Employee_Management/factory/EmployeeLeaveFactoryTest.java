package za.ac.cput.capstone_Employee_Management.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;

import static org.junit.jupiter.api.Assertions.*;

/*
EMPLOYEE_LEAVE_FACTORY_TEST.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */

@Slf4j
class  EmployeeLeaveFactoryTest {
    EmployeeLeave emleave;

    @Test
    void createEmployeeLeave() {
        emleave = EmployeeLeaveFactory.build(6636L,433L);
        log.info("EmployeeLeave", emleave);
        assertNotNull(emleave);
    }
}
