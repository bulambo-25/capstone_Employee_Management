package za.ac.cput.capstone_Employee_Management.api;


/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeAddress;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.AddressTypeimpl;
import za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl.EmployeeAddressIm;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeService;
@Component
@Slf4j
public class EmployeeAddressAPI {
    private EmployeeService employeeService;
    private AddressTypeimpl AddressTypeService;
    private EmployeeAddressIm addressIm;

    public EmployeeAddressAPI(EmployeeService employeeService, AddressTypeimpl addressTypeService, EmployeeAddressIm addressIm) {
        this.employeeService = employeeService;
        AddressTypeService = addressTypeService;
        this.addressIm = addressIm;
    }

    public EmployeeAddress save(EmployeeAddress employeeAddress)
    {
        this.employeeService.read(employeeAddress.getEmployeeId()).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Employee id does not  exist"));
        this.AddressTypeService.read(employeeAddress.getAddressTypeId()).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "AddressType id does not  exist"));
        return this.addressIm.save(employeeAddress);
    }
}
