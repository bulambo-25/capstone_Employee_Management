package za.ac.cput.capstone_Employee_Management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
import za.ac.cput.capstone_Employee_Management.factory.ContactTypeFactory;
import za.ac.cput.capstone_Employee_Management.repository.interf.ContactTypeRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.ContactTypeService;

import java.util.List;
import java.util.Optional;

@Service
public class ContactTypeServiceImpl implements ContactTypeService {
    final ContactTypeRepository contactTypeRepository;

    @Autowired
    public ContactTypeServiceImpl(ContactTypeRepository contactTypeRepository) {
        this.contactTypeRepository = contactTypeRepository;
    }


    @Override
    public List<ContactType> findAll() {
        return contactTypeRepository.findAll();
    }

    @Override
    public void deleteByID(String ID) {
        contactTypeRepository.deleteById(ID);
    }

    @Override
    public ContactType save(ContactType contactType) {

       ContactType contactType2= ContactTypeFactory.build(contactType.getEmail(),contactType.getPhoneNumber());
        return contactTypeRepository.save(contactType2);
    }

    @Override
    public Optional<ContactType> read(String ID) {
        return contactTypeRepository.findById(ID);
    }

    @Override
    public void delete(ContactType contactType) {
        contactTypeRepository.delete(contactType);
    }
}
