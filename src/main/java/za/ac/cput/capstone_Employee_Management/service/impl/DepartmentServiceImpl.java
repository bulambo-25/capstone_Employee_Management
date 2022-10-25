package za.ac.cput.capstone_Employee_Management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.Department;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.factory.DepartmentFactory;
import za.ac.cput.capstone_Employee_Management.repository.interf.DepartmentRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.DepartmentService;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;

    }

    @Override
    public List<Department> findAll() {

        return departmentRepository.findAll();
    }

    @Override
    public void deleteByID(Long ID) {

        departmentRepository.deleteById(ID);
    }

    @Override
    public Department save(Department department) {

        Department department2= DepartmentFactory.build(department.getDeptName(),department.getDeptDesc());
        return departmentRepository.save(department2);
    }

    @Override
    public Optional<Department> read(Long integer) {
        return this.departmentRepository.findById(integer);
    }

    @Override
    public void update(Long aLong, Department obj) {
        List<Department>  list=findAll();
        for( int i=0; i<list.size(); i++) {
            Department department=list.get(i);
            if (department.getDeptId().equals(obj.getDeptId())) {
                departmentRepository.save(obj);
            }
        }
    }

    @Override
    public void delete(Department department) {

        departmentRepository.delete(department);
    }

}
