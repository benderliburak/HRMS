package spring.homework.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import spring.homework.business.abstracts.JobPositionService;
import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.Result;
import spring.homework.entities.concreate.JobPosition;

@RestController
@RequestMapping("api/jobposition")
public class JobPositionController {
	private final JobPositionService jobPositionService;
	
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}


	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionService.getAll();		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
	
	
	
	
}
