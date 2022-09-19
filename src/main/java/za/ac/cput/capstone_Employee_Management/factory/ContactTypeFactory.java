package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.helper.Helper;
/*
ContactType.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date 19 Sep 2022
 */
public class ContactTypeFactory {

public static ContactType build(String email,String phoneNumber){
    Helper.checkStringPara("email: ",email);
    Helper.IsValidEmail(email);
    Helper.checkStringPara("phoneNumber: ",phoneNumber);

    return new ContactType.Builder()
            .setEmail(email)
            .setPhoneNumber(phoneNumber)
            .build();
}
}
