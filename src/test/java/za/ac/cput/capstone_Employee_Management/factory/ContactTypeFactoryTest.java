package za.ac.cput.capstone_Employee_Management.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class ContactTypeFactoryTest {
    ContactType contact;
    @Test
    void createContactType() {
        contact =ContactTypeFactory.build("fchawora@gmail.com", "22345543");
        log.info("EmployeeContact", contact);
        assertNotNull(contact);
    }

    @Test
    void createContactTypeWithError() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> ContactTypeFactory.build( "ss.com", "22345543"));
        assertEquals("Invalid Email", exception.getMessage());

    }

}