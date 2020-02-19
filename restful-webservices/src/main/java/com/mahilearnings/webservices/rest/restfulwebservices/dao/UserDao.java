package com.mahilearnings.webservices.rest.restfulwebservices.dao;

import java.util.List;
import java.util.Map;

import com.mahilearnings.webservices.rest.restfulwebservices.beans.User;

public interface UserDao {
	
	public List<User> findAll();
	
	public User save(User user); 
	
	public User findOne(int id);

	public Map<Integer, String> getAllPosts(int userId);
	
	public String getPost(int userId, int postId);

	public Map<Integer, String> findUserPost(int userId, int postId);

	public Map<Integer, String> saveUserPost(int userId, String post);

	public User deleteUser(int id);

}
