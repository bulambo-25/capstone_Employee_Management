package za.ac.cput.capstone_Employee_Management.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeDepartment;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeDepartmentFactory;
//import za.ac.cput.capstone_Employee_Management.repository.interf.service.impl.employeeImpl.EmployeeDepartmentServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeDepartmentServiceImpl;

import java.util.List;
import java.util.Optional;


@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
public class EmployeeDepartmentServiceImplTest {
    @Autowired
    private EmployeeDepartmentServiceImpl employeeDepartmentService;
    final EmployeeDepartment empdept= EmployeeDepartmentFactory.build(35L, 44L);

    @BeforeEach
    void SETup(){
        a_save();
    }
    @Test
    void a_save(){
        EmployeeDepartment save = employeeDepartmentService.save(empdept);
        assertNotNull(save);

    }
    @Test
    void b_read() {
       a_save();
        //Optional<EmployeeDepartment> temp=employeeDepartmentService.read
                //(new EmployeeDepartment.EmployeeDepartmentID().setEmployeeId(empdept.getEmployeeId()));


    }
    @Test
    void c_delete() {
        employeeDepartmentService.delete(empdept);
        List<EmployeeDepartment> temp=employeeDepartmentService.findAll();
        System.out.println(temp);

    }


    @Test
    void d_findall() {
        List<EmployeeDepartment> temp=employeeDepartmentService.findAll();
        System.out.println(temp.toString());
        assertNotNull(temp);
    }

}
