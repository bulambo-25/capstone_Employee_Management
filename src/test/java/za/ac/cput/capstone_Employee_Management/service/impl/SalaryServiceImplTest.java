package za.ac.cput.capstone_Employee_Management.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.Salary;
import za.ac.cput.capstone_Employee_Management.factory.SalaryFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SalaryServiceImplTest
{
    @Autowired
    private SalaryServiceImpl salaryService;
    final Salary salary= SalaryFactory.build("20000", "Monthly");

    @Test
    @Order(1)
    void save()
    {
        Salary save = salaryService.save(salary);
        assertNotNull(save);
        System.out.println(save.toString());
    }

    @Test
    @Order(2)
    void read()
    {
        Optional<Salary> temp =  salaryService.read(salary.getSalaryId());
        assertAll
                (
                        () -> assertTrue(temp.isPresent()),
                        () -> assertNotNull(temp)
                );
        System.out.println(temp);
    }

    @Test
    @Order(3)
    void delete()
    {
        List<Salary> temp = salaryService.findAll();
        assertEquals(0,temp.size());

    }

    @Test
    @Order(4)
    void findAll()
    {
        List<Salary> temp = salaryService.findAll();
        System.out.println(temp.toString());
        assertNotNull(temp);

    }

}
