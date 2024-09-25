package com.pro.service;

import java.util.List;

import com.pro.exception.UserException;
import com.pro.model.User;

public interface UserService {

public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();
	
}
