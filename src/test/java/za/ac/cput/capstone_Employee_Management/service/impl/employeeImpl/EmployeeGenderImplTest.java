package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeGender;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeGenderFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
@Slf4j
class EmployeeGenderImplTest {
    @Autowired
    private EmployeeGenderImpl service;
    EmployeeGender employeeGender= EmployeeGenderFactory.EmployeeGenderBuilder(23456590L,9876545L);

    @Test
    void a_save() {

        EmployeeGender employeeGende = this.service.save(employeeGender);

        log.info(employeeGender.toString());
    }

    @Test
    void c_delete() {

      //  this.service.delete(employeeGender);
    }

    @Test
    void b_findAll() {
        List<EmployeeGender>list=this.service.findAll();

        log.info(list.toString());
    }
}