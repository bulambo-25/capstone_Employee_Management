package za.ac.cput.capstone_Employee_Management.factory;


import za.ac.cput.capstone_Employee_Management.domain.AddressType;
import za.ac.cput.capstone_Employee_Management.helper.Helper;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */

public class AddressTypeFactory {
    public static AddressType buildAddressType(String streetName, String postalCode,String areaName, String city){

        Helper.checkStringPara("genderType:",streetName);
        Helper.checkStringPara("description",postalCode);
        Helper.checkStringPara("genderType:",areaName);
        Helper.checkStringPara("description",city);

       return  new AddressType.Builder().setStreetName(streetName).setPostalCode(postalCode).setAreaName(areaName)
               .setCity(city).build();
    }
}
