package za.ac.cput.capstone_Employee_Management.service.impl;


import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.Department;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeDepartment;
import za.ac.cput.capstone_Employee_Management.factory.DepartmentFactory;
//mport za.ac.cput.capstone_Employee_Management.repository.interf.service.impl.DepartmentServiceImpl;

import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
public class DepartmentServiceImplTest {
    @Autowired
    private DepartmentServiceImpl departmentService;
    final Department dept= DepartmentFactory.build("IT_Dep", "design&code");

    @Test
    void a_save(){
        Department save =departmentService.save(dept);
        assertNotNull(save);
    }


    @Test
    void b_read() {
        a_save();
        Department depp= DepartmentFactory.build("Marketing_Dep","Marketing");
        departmentService.save(depp);
        Optional<Department> temp=departmentService.read(3l);

        System.out.println(temp);


    }
    @Test
    void d_delete() {
       // departmentService.delete(dept);
        List<Department> temp=departmentService.findAll();
       // assertEquals(0,temp.size());
    }

    @Test
    void c_findall() {
        List<Department> temp=departmentService.findAll();
        System.out.println(temp.toString());
        assertNotNull(temp);
    }

}