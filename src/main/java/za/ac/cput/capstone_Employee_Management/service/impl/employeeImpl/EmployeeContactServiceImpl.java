package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
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
        return employeeContactRepository.save(employeeContact);
    }

    @Override
    public Optional<EmployeeContact> read(EmployeeContact.EmployeeContactID employeeContactID) {
        return employeeContactRepository.findById(employeeContactID);
    }

    @Override
    public void update(EmployeeContact.EmployeeContactID employeeContactID, EmployeeContact obj) {

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
