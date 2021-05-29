package spring.homework.business.abstracts;

import java.util.List;



import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.Result;
import spring.homework.entities.concreate.JobPosition;

public interface JobPositionService {

	DataResult<List<JobPosition>> getAll();
	
	Result add(JobPosition jobPosition);
	
}
