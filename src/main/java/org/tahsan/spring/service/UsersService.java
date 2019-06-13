package org.tahsan.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tahsan.spring.model.Users;
import org.tahsan.spring.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	UsersService() {}
	
	List<Users> users = new ArrayList<>();
	
	@PostConstruct
	public void loadUsers() {
		
		users.add(new Users(1L, "John Doe", "Sales", 1000));
		users.add(new Users(2L, "Jane Doe", "HR", 2000));
		users.add(new Users(3L, "Bill Doe", "Production", 1000));
		
	}

	public Users findByName(String name) {
		// TODO Auto-generated method stub
		return usersRepository.findByName(name);
	}
	
	public List<Users> getAll() {
		System.out.println("I am here ...");
		return this.users;
	}

	public List<Users> findAll() {
		
		return usersRepository.findAll();
	}

	public Users save(Users users) {
		return usersRepository.save(users);
		
	}

}
