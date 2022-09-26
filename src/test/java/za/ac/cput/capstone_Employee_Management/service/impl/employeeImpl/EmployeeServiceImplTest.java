package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeAddressFactor;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeFactory;
import za.ac.cput.capstone_Employee_Management.factory.GenderFactory;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
@Slf4j
class EmployeeServiceImplTest {
    @Autowired
    private  EmployeeServiceImpl service;
    @Autowired
    private GenderServiceImpl repository;


    Employee em= EmployeeFactory.build("malone","Chawora","farai");
    Employee em1= EmployeeFactory.build("bulambo","prince","dray");
    Employee em2= EmployeeFactory.build("safari","martines","nyembo");
    Gender gend1= GenderFactory.GenderBuilder("Male","of or denoting the sex that can bear offspring or produce eggs," +
            " distinguished biologically by the production of gametes");
    @Test
    void save() {
        Gender gender1=this.repository.save(gend1);
        log.info(gender1.toString());
        Employee emmm =this.service.save(em);
        log.info(emmm.toString());
        Employee emmm1 =this.service.save(em1);
        log.info(emmm1.toString());
        Employee emmm2 =this.service.save(em2);
        log.info(emmm2.toString());


    }
}