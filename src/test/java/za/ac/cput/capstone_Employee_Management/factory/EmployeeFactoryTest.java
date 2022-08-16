package za.ac.cput.capstone_Employee_Management.factory;

import com.mysql.cj.log.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class EmployeeFactoryTest {
    Employee emp, emp2;


    @Test
    void createEmployee() {
        emp = EmployeeFactory.build("Farai", "Malone", "Chawora");
        log.info("Employee", emp);
        assertNotNull(emp);
    }

    @Test
    void createEmployeeWithError() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> EmployeeFactory.build("", "Malone", "Chawora"));
        assertEquals("Invalid Value for:firstname", exception.getMessage());

    }

}