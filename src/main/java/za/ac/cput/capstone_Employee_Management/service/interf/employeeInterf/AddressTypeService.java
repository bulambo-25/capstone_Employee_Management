package za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf;

import za.ac.cput.capstone_Employee_Management.domain.AddressType;
import za.ac.cput.capstone_Employee_Management.domain.Gender;
import za.ac.cput.capstone_Employee_Management.service.interf.IService;

import java.util.List;

public interface AddressTypeService extends IService<AddressType,Long> {

    List<AddressType> findAll();

    List<AddressType> findByPostalCodeOrCity(String postalCodeOrCity);
}
