package za.ac.cput.capstone_Employee_Management.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeGender;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.*;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
@Component
@Slf4j
public class EmployeeGenderApi {

    private EmployeeGenderImpl employeeGender;
    private  EmployeeServiceImpl employeeService;
    private GenderServiceImpl genderService;


    public EmployeeGenderApi(EmployeeGenderImpl employeeGender, EmployeeServiceImpl employeeService,
                             GenderServiceImpl genderService)
    {
        this.employeeGender = employeeGender;
        this.employeeService = employeeService;
        this.genderService = genderService;


    }

    public EmployeeGender save(EmployeeGender employeeGender)
    {
        this.employeeService.read(employeeGender.getEmployeeId()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                "Employee id does not  exist"));
        this.genderService.read(employeeGender.getGenderId()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                "gender id does not  exist"));
        return this.employeeGender.save(employeeGender);
    }

}
