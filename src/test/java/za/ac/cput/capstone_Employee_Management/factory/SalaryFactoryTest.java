package za.ac.cput.capstone_Employee_Management.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import za.ac.cput.capstone_Employee_Management.domain.Salary;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class SalaryFactoryTest
{
    Salary salary;
    @Test
    void testSuccessBuild()
    {
        salary = SalaryFactory.build("20000","Monthly");
        log.info("Salary", salary);
        assertNotNull(salary);
    }

    @Test
    void testFailureBuild()
    {
        Exception exception = assertThrows(IllegalArgumentException.class,()-> SalaryFactory.build("1000",""));
        assertEquals("Invalid Input",exception.getMessage());

    }

}
