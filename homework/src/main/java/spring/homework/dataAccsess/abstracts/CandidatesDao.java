package spring.homework.dataAccsess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.homework.entities.concreate.Candidate;

@Repository
public interface CandidatesDao extends JpaRepository<Candidate, Integer> {

	boolean existsByIdentityNumber (String identityNumber);
	
	boolean existsByEmail (String email);
	
	
}
