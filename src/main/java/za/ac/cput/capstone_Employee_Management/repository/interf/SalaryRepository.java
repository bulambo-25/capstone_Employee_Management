package za.ac.cput.capstone_Employee_Management.repository.interf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long>
{

}
