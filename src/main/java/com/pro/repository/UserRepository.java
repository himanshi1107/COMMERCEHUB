package com.pro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByEmail(String email);
	
	public List<User> findAllByOrderByCreatedAtDesc(); 
}
