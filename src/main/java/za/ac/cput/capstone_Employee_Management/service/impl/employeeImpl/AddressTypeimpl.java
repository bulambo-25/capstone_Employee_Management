package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.AddressType;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.AddressTypeRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.AddressTypeService;

import java.util.List;
import java.util.Optional;
@Service
@Slf4j
public class AddressTypeimpl  implements AddressTypeService {

    private AddressTypeRepository repository;
    @Autowired
    public AddressTypeimpl(AddressTypeRepository repository) {
        this.repository = repository;
    }
    @Override
    public AddressType save(AddressType addressType) {
        return  this.repository.save(addressType);
    }

    @Override
    public Optional<AddressType> read(Long aLong) {
        return this.repository.findById(aLong);
    }

    @Override
    public void update(Long aLong, AddressType obj) {

    }

    @Override
    public void delete(AddressType addressType) {
     this.repository.delete(addressType);
    }

    @Override
    public List<AddressType> findAll() {
        List<AddressType> list=this.repository.findAll();
        return list;
    }
    public void deleteById(Long AddressTypeId) {
         this.repository.deleteById(AddressTypeId);

    }
    @Override
    public List<AddressType> findByPostalCodeOrCity(String postalCodeOrCity) {
        return this.repository.getAddressTypeByPostalCode(postalCodeOrCity);
    }
}
