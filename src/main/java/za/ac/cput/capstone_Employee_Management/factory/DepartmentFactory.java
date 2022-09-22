package za.ac.cput.capstone_Employee_Management.factory;


import za.ac.cput.capstone_Employee_Management.domain.Department;
import za.ac.cput.capstone_Employee_Management.helper.Helper;

public class DepartmentFactory {

    public static Department build( String deptName, String deptDesc){


        Helper.checkStringPara("deptName: ",deptName);
        Helper.checkStringPara("deptDesc: ",deptDesc);

        return new Department.Builder()
                .setDeptName(deptName)
                .setDeptDesc(deptDesc)
                .build();
    }


    public static Department createDepartment(String s, String c876, String s1) {
        return null;
    }
}