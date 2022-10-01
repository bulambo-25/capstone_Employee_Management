package za.ac.cput.capstone_Employee_Management.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.Leaves;
import za.ac.cput.capstone_Employee_Management.factory.LeaveFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/*
LEAVE_SERVICE_IMPL_TEST.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class LeaveServiceImplTest {
    @Autowired
    private LeaveServiceImpl leaveService;
    final Leaves leave= LeaveFactory.build(33L,6L);

    @Test
    void a_save() {
        Leaves tle = leaveService.save(leave);
        assertNotNull(tle);
    }

    @Test
    void b_read() {
        a_save();
        Optional<Leaves> tle = leaveService.read(1L);
        assertAll(
                () -> assertTrue(tle.isPresent()),

                () -> assertNotNull(tle)

        );
        System.out.println(tle);
    }
    @Test
    void d_delete() {
        //  leaveService.delete(leave);
        List<Leaves> le=leaveService.findAll();
        // assertEquals(0,le.size());
    }


    @Test
    void c_findall() {
        List<Leaves> le =leaveService.findAll();
        System.out.println(le.toString());
        assertNotNull(le);
    }

}
