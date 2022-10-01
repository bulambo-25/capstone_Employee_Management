package za.ac.cput.capstone_Employee_Management.service.interf;

import za.ac.cput.capstone_Employee_Management.domain.Leaves;

import java.util.List;

/*
LEAVE_SERVICE.INTERFACE
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */
public interface LeaveService  extends IService<Leaves, Long>
{


    List<Leaves> findAll();
    void deleteByleaveId(Long ID);
}