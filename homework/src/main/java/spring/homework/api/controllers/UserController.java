package spring.homework.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.homework.business.abstracts.UserService;
import spring.homework.core.utilities.result.DataResult;

import spring.homework.entities.concreate.user;

@RestController
@RequestMapping("api/users")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}


	@GetMapping("/getall")
	public DataResult<List<user>> getAll(){
		return this.userService.getAll();		
	}
	
}
