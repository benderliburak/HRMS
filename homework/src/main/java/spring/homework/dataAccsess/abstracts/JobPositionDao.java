package spring.homework.dataAccsess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.homework.entities.concreate.JobPosition;
//JpaRepostory add delete gibi işlemleri otamatik ekliyor
@Repository
public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{
 
}
