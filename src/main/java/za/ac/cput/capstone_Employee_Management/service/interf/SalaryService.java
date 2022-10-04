package za.ac.cput.capstone_Employee_Management.service.interf;
/*
 Author: Taariq Khan (219231141)
 Date: September 2022
 */
import za.ac.cput.capstone_Employee_Management.domain.Salary;

import java.util.List;

public interface SalaryService extends IService <Salary,Long>
{
    List<Salary> findAll();
    void deleteByID(Long ID);

}
