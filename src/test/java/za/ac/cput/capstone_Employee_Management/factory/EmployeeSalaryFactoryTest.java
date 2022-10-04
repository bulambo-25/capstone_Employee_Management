package za.ac.cput.capstone_Employee_Management.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeSalary;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class EmployeeSalaryFactoryTest
{
    @Test
    public void buildWithSuccess()//test passed with student ID provided
    {
        EmployeeSalary employeeSalary = EmployeeSalaryFactory.build(436534566L, 3543453L);
        log.info("EmployeeSalary", employeeSalary);
        assertNotNull(employeeSalary);
    }

    @Test
    public void buildWithFailureError()//no student ID provided error test
    {
        Exception exception = assertThrows(IllegalArgumentException.class,()-> EmployeeSalaryFactory.build(445576L, 0L));
        assertEquals("Invalid input",exception.getMessage());
    }
}
