package spring.homework.dataAccsess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.homework.entities.concreate.Employer;

@Repository
public interface EmployerUserDao extends JpaRepository<Employer, Integer> {

	

}
