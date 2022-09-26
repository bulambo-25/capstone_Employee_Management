package za.ac.cput.capstone_Employee_Management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import za.ac.cput.capstone_Employee_Management.domain.AddressType;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;

import za.ac.cput.capstone_Employee_Management.factory.AddressTypeFactory;
import za.ac.cput.capstone_Employee_Management.factory.ContactTypeFactory;

import za.ac.cput.capstone_Employee_Management.factory.EmployeeFactory;
import za.ac.cput.capstone_Employee_Management.service.impl.ContactTypeServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.AddressTypeimpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeAddressIm;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeContactServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeServiceImpl;

@SpringBootApplication
public class CapstoneEmployeeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapstoneEmployeeManagementApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ContactTypeServiceImpl contactTypeService, EmployeeServiceImpl employeeService
            , EmployeeContactServiceImpl employeeContactService, EmployeeAddressIm employeeAddressIm, AddressTypeimpl addressTypeimpl) {
        return  args -> {
            ContactType con =ContactTypeFactory.build("ms@gmail.com","0879986541");
            Employee emp=EmployeeFactory.build("martinez","sarafi","safari");
            contactTypeService.save(con);
            employeeService.save(emp);
            EmployeeContact empCon= new EmployeeContact.Builder().setEmployeeId(emp.getEmployeeId()).setContactId(con.getContactId()).build();
           employeeContactService.save(new EmployeeContact.Builder().setEmployeeId(12L).setContactId(2L).build());
            AddressType addressType= AddressTypeFactory.buildAddressType("fame Crescent","7140"
                    ,"Strand","CAPEtOWN ");
            addressTypeimpl.save(addressType);
            EmployeeAddress employeeAddress= new EmployeeAddress.Builder().setEmployeeId(3L)
                    .setAddressTypeId(323456590L).Build();
            System.out.println(employeeAddress.toString());
            System.out.println(emp.toString());
            System.out.println(addressType.toString());
           employeeAddressIm.save(employeeAddress);
    };

    }
}
