package za.ac.cput.capstone_Employee_Management.repository.interf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.capstone_Employee_Management.domain.ContactType;
/*
ContactType.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date 19 Sep 2022
 */
@Repository
public interface ContactTypeRepository extends JpaRepository<ContactType,Long> {
    ContactType findContactTypeByEmail(String email);
}
