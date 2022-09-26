package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
import za.ac.cput.capstone_Employee_Management.helper.Helper;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
public class EmployeeAddressFactor {
    public  static EmployeeAddress EmployeeAddressBuilder( Long employeeId,Long addressTypeId)
    {
        Helper.checkStringPara("employeeId:", String.valueOf(employeeId));
        Helper.checkStringPara("addressTypeId", String.valueOf(addressTypeId));
        return new EmployeeAddress.Builder().setAddressTypeId(employeeId).setAddressTypeId(addressTypeId).Build();
    }
}
