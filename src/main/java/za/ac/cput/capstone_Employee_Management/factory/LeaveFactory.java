package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.Leaves;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.helper.Helper;
/*
LEAVE_FACTORY.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */

public class LeaveFactory {

    public  static Leaves build(Long leaveId, Long daysOfLeave){

        return new Leaves.Builder()
                .setLeaveId(leaveId).setDaysOfLeave(daysOfLeave).build();

    }


}