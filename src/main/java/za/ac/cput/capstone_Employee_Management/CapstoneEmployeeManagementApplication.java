package za.ac.cput.capstone_Employee_Management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeDepartment;
import za.ac.cput.capstone_Employee_Management.factory.ContactTypeFactory;

import za.ac.cput.capstone_Employee_Management.factory.DepartmentFactory;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeDepartmentFactory;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeFactory;
import za.ac.cput.capstone_Employee_Management.service.impl.ContactTypeServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.DepartmentServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeContactServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeDepartmentServiceImpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeServiceImpl;

@SpringBootApplication
public class CapstoneEmployeeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapstoneEmployeeManagementApplication.class, args);
    }

    @Bean
        //CommandLineRunner run(ContactTypeServiceImpl contactTypeService, EmployeeServiceImpl employeeService,EmployeeContactServiceImpl employeeContactService) {
        // return  args -> {
        //Employee emp=EmployeeFactory.build("martinez","sarafi","safari");
        // contactTypeService.save(con);
        // employeeService.save(emp);
        //EmployeeContact empCon= new EmployeeContact.Builder().setEmployeeId(emp.getEmployeeId()).setContactId(con.getContactId()).build();
        // employeeContactService.save(new EmployeeContact.Builder().setEmployeeId(12L).setContactId(2L).build());

    CommandLineRunner run(EmployeeDepartmentServiceImpl employeeDepartmentService, EmployeeServiceImpl employeeService,DepartmentServiceImpl departmentService) {
        return args -> {


            //employeeDepartmentService.save(EmployeeDepartmentFactory.build(23L, 45L));
            //employeeDepartmentService.save(EmployeeDepartmentFactory.build(87L, 30L));
            //  departmentService.save(DepartmentFactory.build("IT_Dep", "design&code"));
            employeeDepartmentService.save(new EmployeeDepartment.Builder().setEmployeeId(3l).setDeptId(2L).build());
            Employee emp=EmployeeFactory.build("martinez","sarafi","safari");
            employeeService.save(emp);
            departmentService.save(DepartmentFactory.build("Marketing_Dep", "business"));
        };
//ContactType con =ContactTypeFactory.build("ms@gmail.com","0879986541");
        //
    }
}

