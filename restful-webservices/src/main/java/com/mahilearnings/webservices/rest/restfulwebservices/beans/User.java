package com.mahilearnings.webservices.rest.restfulwebservices.beans;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class User {
	
	private Integer id;
	private String name;
	private Date birthDate;
	private Map<Integer, String> posts;
	int numPosts = 0;
	
	protected User(){
		
	}
	
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		Map<Integer, String> posts = new HashMap<Integer, String>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Map<Integer, String> getPosts() {
		return posts;
	}

	public void savePost(String post) {
		this.posts.put(++numPosts, post);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate.toString() + ", posts=" + posts.toString() + "]";
	}
	
	

}
