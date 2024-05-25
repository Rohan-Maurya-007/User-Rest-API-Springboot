package com.kaddipatta.Spring_Boot_User_Crud_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kaddipatta.Spring_Boot_User_Crud_App.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User save(User user);
	
//	User findById(int id);
	
	@Query("select u from User u where u.email=:email AND u.password=:pwd")
	User validate( @Param("email") String email, @Param("pwd") String password);
}
