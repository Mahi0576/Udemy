package com.mahilearnings.webservices.rest.restfulwebservices.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.mahilearnings.webservices.rest.restfulwebservices.beans.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	private static List<User> list = null;
	
	private static int userCount = 0;
	
	static{
		list = new ArrayList();
		list.add(new User(++userCount, "Mahi", new Date()));
		list.add(new User(++userCount, "Chintu", new Date()));
		list.add(new User(++userCount, "Vishu", new Date()));
	}
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		if(user.getId() == null)
			user.setId(++userCount);
		list.add(user);
		return user;
	}

	@Override
	public User findOne(int id) {
		// TODO Auto-generated method stub
		for(User user : list){
			if(user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public List<String> getAllPosts(int userId) {
		// TODO Auto-generated method stub
		List<String> postsList = null;
		for(User user : list){
			if(user.getId() == userId){
				Map<Integer, String> posts = user.getPosts();
				if(!posts.isEmpty()){
					postsList = new ArrayList<String>();
					for(Map.Entry<Integer,String> set : posts.entrySet()){
						postsList.add(set.getValue());
					}
				}
			}
		}
		return postsList;
	}
	
	@Override
	public String getPost(int userId, int postId) {
		// TODO Auto-generated method stub
		String post = null;
		for(User user : list){
			if(user.getId() == userId){
				Map<Integer, String> posts = user.getPosts();
				if(!posts.isEmpty()){
					post = posts.get(postId);
				}
			}
		}
		return post;
	}
}
