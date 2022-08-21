package za.ac.cput.capstone_Employee_Management.service.impl;
/*
test by Farai Malone Chawora
all test passed
contactServiceImp is  fully operational
 */
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.factory.ContactTypeFactory;

import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class ContactTypeServiceImplTest {
    @Autowired
    private ContactTypeServiceImpl contactTypeService;
     final ContactType  con= ContactTypeFactory.build("fchawora@gmail.com", "22345543");

@Test
    void a_save(){
    ContactType save =contactTypeService.save(con);
    assertNotNull(save);
    System.out.println(save.toString());
}
    @Test
    void b_read() {
   a_save();
        Optional<ContactType> temp=contactTypeService.read(con.getContactId());
       assertAll(  ()->assertTrue(temp.isPresent()),
              ()-> assertNotNull(temp)
      );
        System.out.println(temp);
    }
    @Test
    void d_delete() {
     contactTypeService.delete(con);
        List<ContactType> temp=contactTypeService.findAll();
         assertEquals(0,temp.size());
    }

    void d_deleteById() {
        contactTypeService.deleteByID(con.getContactId());
        List<ContactType> temp=contactTypeService.findAll();
        assertEquals(0,temp.size());
        System.out.println(con.toString());
    }

    @Test
    void c_findall() {
        List<ContactType> temp=contactTypeService.findAll();
        System.out.println(temp.toString());
        assertNotNull(temp);
    }

}