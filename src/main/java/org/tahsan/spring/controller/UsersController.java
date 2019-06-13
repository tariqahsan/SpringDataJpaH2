package org.tahsan.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tahsan.spring.model.Users;
import org.tahsan.spring.service.UsersService;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping(value = "/all")
	public List<Users> findAll() {
		return usersService.findAll();
		
	}
	
	@GetMapping(value = "/getUsers")
	public List<Users> getAllUsers() {
		return usersService.getAll();
		
	}
	
	@GetMapping(value = "/{name}")
	public Users findByName(@PathVariable final String name) {
		return usersService.findByName(name);
	}
	
	@PostMapping(value = "/load")
	public Users load(@RequestBody final Users users) {
		return usersService.save(users);
		//return usersService.findByName(users.getName());
	}

}
