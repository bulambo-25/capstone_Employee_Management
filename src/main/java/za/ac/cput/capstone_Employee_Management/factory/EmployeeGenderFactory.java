package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeGender;
import za.ac.cput.capstone_Employee_Management.helper.Helper;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
public class EmployeeGenderFactory {
    public  static EmployeeGender EmployeeGenderBuilder(Long genderId,Long employeeId){

        Helper.checkStringPara("genderId:", String.valueOf(genderId));
        Helper.checkStringPara("employeeId", String.valueOf(employeeId));
        return  new EmployeeGender.Builder().setGenderId(genderId).setEmployeeId(employeeId).Build();
    }
}
