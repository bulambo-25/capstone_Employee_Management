package za.ac.cput.capstone_Employee_Management.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import za.ac.cput.capstone_Employee_Management.domain.Leaves;

import static org.junit.jupiter.api.Assertions.*;

/*
LEAVE_FACTORY_TEST.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */
@Slf4j
class LeaveFactoryTest {
    Leaves leaves;

    @Test
    void createLeave() {
        leaves = LeaveFactory.build(33L,5L);
        log.info("Leave", leaves);
        assertNotNull(leaves);
    }
}