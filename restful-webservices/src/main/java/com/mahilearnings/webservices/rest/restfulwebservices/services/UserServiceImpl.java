package com.mahilearnings.webservices.rest.restfulwebservices.services;

import java.util.List;

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
	public List<String> getAllPosts(int userId) {
		// TODO Auto-generated method stub
		return dao.getAllPosts(userId);
	}

}
