package spring.homework.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.homework.business.abstracts.EmployeersService;
import spring.homework.core.utilities.result.DataResult;
import spring.homework.core.utilities.result.Result;
import spring.homework.entities.concreate.Employees;


@RestController
@RequestMapping("api/employees")
public class EmployeesController {
 private EmployeersService employeersService;

 @Autowired
public EmployeesController(EmployeersService employeersService) {
	super();
	this.employeersService = employeersService;
}
 @GetMapping("/getall")
 public DataResult<List<Employees>> getAll(){
 	return this.employeersService.getAll();		
 }

 @PostMapping("/add")
 public Result add(@RequestBody Employees employees) {
 	return this.employeersService.add(employees);
 }

 
}
