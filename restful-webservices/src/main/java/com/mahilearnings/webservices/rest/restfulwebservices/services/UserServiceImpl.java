package com.mahilearnings.webservices.rest.restfulwebservices.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahilearnings.webservices.rest.restfulwebservices.beans.User;
import com.mahilearnings.webservices.rest.restfulwebservices.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}

	@Override
	public User findOne(int id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public Map<Integer, String> getAllPosts(int userId) {
		// TODO Auto-generated method stub
		return dao.getAllPosts(userId);
	}

	@Override
	public Map<Integer, String> findUserPost(int userId, int postId) {
		// TODO Auto-generated method stub
		return dao.findUserPost(userId, postId);
	}

	@Override
	public Map<Integer, String> saveUserPost(int userId, String post) {
		// TODO Auto-generated method stub
		return dao.saveUserPost(userId, post);
	}

	@Override
	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(id);
	}

}
