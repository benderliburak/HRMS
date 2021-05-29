package spring.homework.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.homework.business.abstracts.CandidatesService;
import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.Result;

import spring.homework.entities.concreate.Candidate;

@RestController
@RequestMapping("api/candidates")
public class CandidatesController {
private final CandidatesService candidatesServis;

@Autowired
public CandidatesController(CandidatesService candidatesServis) {
	super();
	this.candidatesServis = candidatesServis;
}
@GetMapping("/getall")
public DataResult<List<Candidate>> getAll(){
	return this.candidatesServis.getAll();		
}
@PostMapping("/add")
public Result add(@RequestBody Candidate Candidate) {
	return this.candidatesServis.add(Candidate);
}

}
