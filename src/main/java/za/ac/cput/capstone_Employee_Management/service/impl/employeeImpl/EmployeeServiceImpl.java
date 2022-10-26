package za.ac.cput.capstone_Employee_Management.service.impl.employeeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.factory.EmployeeFactory;
import za.ac.cput.capstone_Employee_Management.repository.interf.employeeInterf.EmployeeRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.employeeInterf.EmployeeService;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
      Employee employee2= EmployeeFactory.build(employee.getFirstName(),employee.getMiddleName(),employee.getLastName());
        return employeeRepository.save(employee2);
    }

    @Override
    public Optional<Employee> read(Long Id) {
        return employeeRepository.findById(Id);
    }

  @Override
  public void update(Long aLong, Employee obj) {
    List<Employee>  list=findAll();
    for( int i=0; i<list.size(); i++) {
      Employee employee=list.get(i);
      if (employee.getEmployeeId().equals(obj.getEmployeeId())) {
        employeeRepository.save(obj);
}
    }


  }


  @Override
    public void delete(Employee employee) {
           employeeRepository.delete(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteByEmployeeId(Long ID) {
         employeeRepository.deleteById(ID);
    }

  @Override
  public List<Employee> findByName(String name) {
    return employeeRepository.findEmployeeByLastNameIgnoreCase(name);
  }



}
