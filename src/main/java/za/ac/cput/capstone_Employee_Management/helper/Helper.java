package za.ac.cput.capstone_Employee_Management.helper;
/*
Farai Malone Chawora
Student Number 220145547
ADP 3 PRACTICAL Exam Assignment
Group 3
 */

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {

    public static String generateID()
    {

        return UUID.randomUUID().toString();
    }

    public static boolean isEmptyOrNull(String str)
    {
        return StringUtils.isEmpty(str);
    }
    public static String EmptyIfNull(String str)
    {
        if(isEmptyOrNull(str))
            return "";
        return str;
    }

    public static void checkStringPara(String paraName, String paraValue) {
        if (isEmptyOrNull(paraValue))
            throw new IllegalArgumentException("Invalid Value for:" + paraName);

    }
    public static String IsValidEmail(String str) {
        if (EmailValidator.getInstance().isValid(str)) {
            return str;
        }
        System.out.println("Please enter correct email");
        String str2 = " Invalid Email";
        return str2;
    }
}
