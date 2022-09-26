package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeAddressFactor;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
@Slf4j
class EmployeeAddressImTest {

    @Autowired
    private EmployeeAddressIm service;
    EmployeeAddress address= EmployeeAddressFactor.EmployeeAddressBuilder
            (12345L,123456L);
    @Test
    void save() {
        EmployeeAddress addr=this.service.save(address);
        log.info(addr.toString());
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }

    @Test
    void findAll() {
    }
}