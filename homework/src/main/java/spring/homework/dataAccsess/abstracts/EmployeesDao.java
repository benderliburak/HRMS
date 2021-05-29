package spring.homework.dataAccsess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.homework.entities.concreate.Employees;


@Repository
public interface EmployeesDao extends JpaRepository<Employees, Integer> {
	
}
