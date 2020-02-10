package com.mahilearnings.webservices.rest.restfulwebservices.dao;

import java.util.List;

import com.mahilearnings.webservices.rest.restfulwebservices.beans.User;

public interface UserDao {
	
	public List<User> findAll();
	
	public User save(User user); 
	
	public User findOne(int id);

}
