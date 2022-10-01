package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeLeaveFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
EMPLOYEE_LEAVE_SERVICE_IMPL_TEST.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeLeaveServiceImplTest {
    @Autowired
    private EmployeeLeaveServiceImpl EmpoyeeLeaveService;
    final EmployeeLeave emleave = EmployeeLeaveFactory.build(33L, 48L);

    @Test
    void a_save() {
        EmployeeLeave le = EmpoyeeLeaveService.save(emleave);
        assertNotNull(le);
    }

    @Test
    void b_read() {
        a_save();


        //Optional<EmployeeLeave> le = EmpoyeeLeaveService.read(99);
        // assertAll
        //        () -> assertTrue(le.isPresent()),

        //    () -> assertNotNull(le)

        //  );
        //System.out.println(le);
    }

    @Test
    void d_delete() {
        //  leaveService.delete(leave);
        List<EmployeeLeave> le = EmpoyeeLeaveService.findAll();
        // assertEquals(0,le.size());
    }
    @Test
    void c_findall() {
        List<EmployeeLeave> le =EmpoyeeLeaveService.findAll();
        System.out.println(le.toString());
        assertNotNull(le);
    }

}


