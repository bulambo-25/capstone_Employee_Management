package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.helper.Helper;

public class ContactTypeFactory {

public static ContactType build(String email,String phoneNumber){
    String contactTypeID= Helper.generateID();
    Helper.checkStringPara("contactTypeID: ",contactTypeID);
    Helper.checkStringPara("email: ",email);
    Helper.IsValidEmail(email);
    Helper.checkStringPara("phoneNumber: ",phoneNumber);

    return new ContactType.Builder().setContactId(contactTypeID)
            .setEmail(email)
            .setPhoneNumber(phoneNumber)
            .build();
}
}
