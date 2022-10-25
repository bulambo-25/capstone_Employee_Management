package za.ac.cput.capstone_Employee_Management.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.capstone_Employee_Management.domain.Leaves;
import za.ac.cput.capstone_Employee_Management.domain.employee.Employee;
import za.ac.cput.capstone_Employee_Management.factory.LeaveFactory;
import za.ac.cput.capstone_Employee_Management.repository.interf.LeaveRepository;
import za.ac.cput.capstone_Employee_Management.service.interf.LeaveService;

import java.util.List;
import java.util.Optional;

/*
LEAVE_SERVICE_IMPL.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */
@Service
public class LeaveServiceImpl implements LeaveService {

    private final LeaveRepository leaveRepository;

    public LeaveServiceImpl(LeaveRepository leaveRepository) {

        this.leaveRepository = leaveRepository;
    }

    @Override
    public Leaves save(Leaves leave) {
        Leaves employee22= LeaveFactory.build(leave.getLeaveId(),leave.getDaysOfLeave());

        return this.leaveRepository.save(employee22);
    }

    @Override
    public Optional<Leaves> read(Long Integer) {
        return this.leaveRepository.findById(Integer);
    }

    @Override
    public void update(Long aLong, Leaves obj) {
        List<Leaves>  list=findAll();
        for( int i=0; i<list.size(); i++) {
            Leaves employee=list.get(i);
            if (employee.getLeaveId().equals(obj.getLeaveId())) {
                leaveRepository.save(obj);
            }
        }
    }


    @Override
    public void delete(Leaves leave) {
        this.leaveRepository.delete(leave);
    }


    @Override
    public List<Leaves> findAll() {
        return this.leaveRepository.findAll();
    }

    @Override
    public void deleteByleaveId(Long ID) {
        Optional<Leaves> leave = read(ID);
        if (leave.isPresent()) delete(leave.get());
    }

    // @Override
    //public  void deleteByID(int ID){
    //   leaveRepository.deleteById(ID);
    // }
}
