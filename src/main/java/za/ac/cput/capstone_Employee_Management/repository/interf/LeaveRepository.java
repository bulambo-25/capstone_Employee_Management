package za.ac.cput.capstone_Employee_Management.repository.interf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.Leaves;
/*
LEAVE_REPOSITORY.INTERFACE
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */

@Repository
public interface LeaveRepository extends JpaRepository<Leaves,Long> {

}