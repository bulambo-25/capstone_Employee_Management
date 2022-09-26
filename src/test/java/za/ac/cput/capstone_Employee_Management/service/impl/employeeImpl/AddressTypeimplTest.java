package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.capstone_Employee_Management.domain.AddressType;
import za.ac.cput.capstone_Employee_Management.factory.AddressTypeFactory;

import java.util.List;
import java.util.Optional;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
@Slf4j
class AddressTypeimplTest {

    @Autowired
    private AddressTypeimpl addressTypeimpl;

    AddressType addressType= AddressTypeFactory.buildAddressType("Rose road","23432","Good wood",
            "Capetown");
    AddressType addressType1= AddressTypeFactory.buildAddressType("alma","7689","lyon",
            "Paris");
    AddressType addressType2= AddressTypeFactory.buildAddressType("babemba","4321","golf",
            "Lubumbashi");
    AddressType addressType3= AddressTypeFactory.buildAddressType("spenci","432","Woodstock",
            "Capetown");
    AddressType addressType4= AddressTypeFactory.buildAddressType("deylo","7892","mancity",
            "London");
    AddressType addressType5= AddressTypeFactory.buildAddressType("road","1342","penad",
            "Capetown");
    @Test
    void a_save()
    {
        AddressType addressT=this.addressTypeimpl.save(addressType);
        AddressType addressT1=this.addressTypeimpl.save(addressType1);
        AddressType addressT2=this.addressTypeimpl.save(addressType2);
        AddressType addressT3=this.addressTypeimpl.save(addressType3);
        AddressType addressT4=this.addressTypeimpl.save(addressType4);
        AddressType addressT5=this.addressTypeimpl.save(addressType5);
        log.info(addressT.toString());
        log.info(addressT1.toString());
        log.info(addressT2.toString());
        log.info(addressT3.toString());
        log.info(addressT4.toString());
        log.info(addressT5.toString());
    }
    @Test
    void b_read() {


        Optional<AddressType> temp=this.addressTypeimpl.read(323456591L);
        log.info(temp.toString());
    }

    @Test
    void c_delete()
    {
        this.addressTypeimpl.delete(addressType1);
    }
    @Test
    void c_findAll()
    {
        List<AddressType> list = this.addressTypeimpl.findAll();
        log.info(list.toString());
    }
    @Test
    void c_findBypostalCodeOrCity()
    {
        List<AddressType>list=this.addressTypeimpl.findByPostalCodeOrCity("7892");
        log.info(list.toString());
    }
}