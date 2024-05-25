package com.kaddipatta.Spring_Boot_User_Crud_App.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kaddipatta.Spring_Boot_User_Crud_App.dto.User;
import com.kaddipatta.Spring_Boot_User_Crud_App.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	private UserRepository repository;
	
//	public void saveUSer(User user) {
//		repository.save(user);
//	}
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	
//	public User findById(int id) {
//		return repository.findById(id);
//	}
	
	public Optional<User> findById(int id){
		return repository.findById(id);
	}
	
	public User update(User user) {
		return repository.save(user);
	}
	
	public User login(User user) {
		return repository.validate(user.getEmail(), user.getPassword());
	}
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public void deleteById(int id) {
		 repository.deleteById(id);
	}
}
