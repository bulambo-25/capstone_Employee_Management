package za.ac.cput.capstone_Employee_Management.repository.interf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;

@Repository
public interface ContactTypeRepository extends JpaRepository<ContactType,String> {
    ContactType findContactTypeByEmail(String email);
}
