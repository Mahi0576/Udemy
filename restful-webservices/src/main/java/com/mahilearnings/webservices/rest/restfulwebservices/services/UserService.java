package com.mahilearnings.webservices.rest.restfulwebservices.services;

import java.util.List;
import java.util.Map;

import com.mahilearnings.webservices.rest.restfulwebservices.beans.User;

public interface UserService {

	public List<User> findAll();
	
	public User save(User user); 
	
	public User findOne(int id);

	public Map<Integer, String> getAllPosts(int userId);

	public Map<Integer, String> findUserPost(int userId, int postId);

	public Map<Integer, String> saveUserPost(int userId, String post);

	public User deleteUser(int id);
	
}
