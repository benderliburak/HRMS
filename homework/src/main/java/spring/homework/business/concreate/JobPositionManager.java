package spring.homework.business.concreate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import spring.homework.business.abstracts.JobPositionService;
import spring.homework.core.utilities.result.*;
import spring.homework.dataAccsess.abstracts.JobPositionDao;
import spring.homework.entities.concreate.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
 private JobPositionDao jobPositionDao;
 
 	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
	super();
	this.jobPositionDao = jobPositionDao;
}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>
		(this.jobPositionDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add( JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		 
		return new SuccessResult("kayıt gerçekleşti");
	}




	

	

}
