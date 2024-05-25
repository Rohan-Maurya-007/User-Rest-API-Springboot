package com.kaddipatta.Spring_Boot_User_Crud_App.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kaddipatta.Spring_Boot_User_Crud_App.dao.UserDao;
import com.kaddipatta.Spring_Boot_User_Crud_App.dto.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
//	public void saveUser(User user ) {
//		dao.saveUSer(user);
//	}
	
	public User saveUser(User user ) {
		return dao.saveUser(user);
	}
	
//	public User findById(int id ) {
//		return dao.findById(id);
//	}
	
	public Optional<User> findById(int id){
		return dao.findById(id);
	}
	
	public User update(User user) {
		return dao.update(user);
	}
	
	public User login(User user) {
		return dao.login(user);
	}
	
	public List<User> findAll(){
		return dao.findAll();
	}
	
	public void deleteById(int id) {
		 dao.deleteById(id);
	}
}
