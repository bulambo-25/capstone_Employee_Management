package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeSalary;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeSalaryFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class EmployeeSalaryServiceImplTest
{
    @Autowired
    private EmployeeSalaryServiceImpl employeeSalaryService;
    EmployeeSalary employeeSalary = EmployeeSalaryFactory.build(436534566L, 3543453L);

    @Test
    @Order(1)
    void save()
    {
        EmployeeSalary employeeSalary1 = employeeSalaryService.save(employeeSalary);
        assertNotNull(employeeSalary1);
    }

    @Test
    @Order(2)
    void read()
    {
        save();
//        Optional<EmployeeSalary> employeeSalary1 =  employeeSalaryService.read(1234L);
//        assertAll
//                (
//                        () -> assertTrue(employeeSalary1.isPresent()),
//                        () -> assertNotNull(employeeSalary1)
//                );
//        System.out.println(employeeSalary1);
    }

    @Test
    @Order(3)
    void delete()
    {
        employeeSalaryService.delete(employeeSalary);
        List<EmployeeSalary > employeeSalary = employeeSalaryService.findAll();
        assertEquals(0,employeeSalary.size());
        assertNotNull(employeeSalary);
    }


    @Test
    @Order(4)
    void findAll()
    {
        List<EmployeeSalary> employeeSalary1 = employeeSalaryService.findAll();
        System.out.println(employeeSalary1.toString());
        assertNotNull(employeeSalary1);

    }










}
