package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.helper.Helper;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
public class GenderFactory {
    public  static Gender GenderBuilder(String genderType, String description){

        Helper.checkStringPara("genderType:",genderType);
        Helper.checkStringPara("description",description);
        return  new Gender.Builder().setGenderType(genderType).setDescription(description).Build();
    }
}
