package za.ac.cput.capstone_Employee_Management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.factory.ContactTypeFactory;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeFactory;
import za.ac.cput.capstone_Employee_Management.service.impl.ContactTypeServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeContactServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeServiceImpl;

@SpringBootApplication
public class CapstoneEmployeeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapstoneEmployeeManagementApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ContactTypeServiceImpl contactTypeService, EmployeeServiceImpl employeeService) {
        return  args -> {
            contactTypeService.save( ContactTypeFactory.build("fc@gmail.com","0879986541"));
            contactTypeService.save( ContactTypeFactory.build("manu@gmail.com","0896541232"));
            employeeService.save(EmployeeFactory.build("Farai","Malone","Chawora"));
            employeeService.save(EmployeeFactory.build("Manu","Tatenda","Chawora"));
        };

    }
}
