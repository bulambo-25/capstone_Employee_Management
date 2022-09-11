package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeContactFactory;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.EmployeeContactRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeContactService;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeContactServiceImpl implements EmployeeContactService {
final EmployeeContactRepository employeeContactRepository;
 @Autowired
    public EmployeeContactServiceImpl(EmployeeContactRepository employeeContactRepository) {
        this.employeeContactRepository = employeeContactRepository;
    }

    @Override
    public EmployeeContact save(EmployeeContact employeeContact) {
     EmployeeContact employeeContact2= EmployeeContactFactory.build(employeeContact.getEmployeeId(),employeeContact.getContactId());
        return employeeContactRepository.save(employeeContact2);
    }

    @Override
    public Optional<EmployeeContact> read(String s) {
        return employeeContactRepository.findById(s);
    }

    @Override
    public void delete(EmployeeContact employeeContact) {
employeeContactRepository.delete(employeeContact);
    }

    @Override
    public List<EmployeeContact> findAll() {
        return employeeContactRepository.findAll();
    }
}
