package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.factory.GenderFactory;

import java.util.List;
import java.util.Optional;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
@Slf4j
class GenderServiceImplTest {
    @Autowired
    private GenderServiceImpl repository;
    Gender gender= GenderFactory.GenderBuilder("Male","a man or a boy. : an individual of the sex that is typically capable of producing small," +
            " usually motile gametes (such as sperm or spermatozoa) which fertilize the eggs of a female.");
    Gender gender1= GenderFactory.GenderBuilder("Male","of or denoting the sex that can bear offspring or produce eggs," +
            " distinguished biologically by the production of gametes");
    Gender gender2= GenderFactory.GenderBuilder("Intersex","a boy");
    Gender gender3= GenderFactory.GenderBuilder("Transgender","Transgender people feel that the sex they were assigned " +
            "at birth doesn't match their gender identity, or the gender that they feel they are inside..”");
    Gender gender4= GenderFactory.GenderBuilder("Non-Conforming","gender expression by an individual that does not match masculine or feminine gender norms");

    @Test
    void a_save()
    {
        Gender gender1=this.repository.save(gender);
        this.repository.save(gender1);
        this.repository.save(gender2);
        this.repository.save(gender3);
        this.repository.save(gender4);
        log.info(gender1.toString());
    }

    @Test
    void b_read() {


       Optional<Gender> temp=this.repository.read(323456591L);
        log.info(temp.toString());
    }

    @Test
    void c_delete()
    {
        // this.repository.delete(gender);
    }
    @Test
    public void d_findAll() {

        List<Gender> list=this.repository.findAll();
        log.info(list.toString());
    }

    @Test
    void f_findAllDescription() {

        List<Gender> list=this.repository.findAllDescription("identity");

        log.info(list.toString());
    }
   @Test
    void g_testFindBGenderId() {
       // this.repository.findBGenderId();
    }
    @Test
    void h_findByGenderId() {

        this.repository.findByGenderId(323456591L);
    }
    @Test
    void z_findAllId() {

        List<Long>list=this.repository.findAllId();
        log.info(list.toString());
    }

}