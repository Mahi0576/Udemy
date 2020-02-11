package com.mahilearnings.webservices.rest.restfulwebservices.services;

import java.util.List;

import com.mahilearnings.webservices.rest.restfulwebservices.beans.User;

public interface UserService {

	public List<User> findAll();
	
	public User save(User user); 
	
	public User findOne(int id);

	public List<String> getAllPosts(int userId);
	
}
