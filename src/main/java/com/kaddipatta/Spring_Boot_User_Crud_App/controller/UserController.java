package com.kaddipatta.Spring_Boot_User_Crud_App.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaddipatta.Spring_Boot_User_Crud_App.dto.User;
import com.kaddipatta.Spring_Boot_User_Crud_App.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
//	@PostMapping("/save/user")
//	public void saveUser( @RequestBody User user) {
//		service.saveUser(user);
//	}
	
	@PostMapping("/save/user")
	public User saveUser( @RequestBody User user) {
		 return service.saveUser(user);
	}
	
//	@GetMapping("/find/user/id")
//	public User findById( @RequestParam int id) {
//		return service.findById(id);
//	}
	
//	@GetMapping("/find/user/{id}")
//	public User findById( @PathVariable int id) {
//		return service.findById(id);
//	}
	
	
	@GetMapping("/find/user/{id}")
	public Optional<User> findById( @PathVariable int id) {
		return service.findById(id);
	}
	
	@PatchMapping("/update/user")
	public User update(@RequestBody User user){
		return service.update(user);
	}
	
	@GetMapping("/login")
	public User login( @RequestBody User user) {
		return service.login(user);
		
	}
	
	@GetMapping("/findall/user")
	public List<User> findAll(){
		return service.findAll();
	}
	
	@DeleteMapping("/delete/user/{id}")
	public void deleteById( @PathVariable int id) {
		service.deleteById(id);	}
}
