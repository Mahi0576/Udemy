package com.mahilearnings.webservices.rest.restfulwebservices.beans;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All details of the user")
public class User {
	
	private Integer id;
	
	@Size(min=2, message="Name should have atleast two characters")
	@ApiModelProperty(notes="Name should have atleast two characters")
	private String name;
	
	@Past
	@ApiModelProperty(notes="Birth date can't be future date")
	private Date birthDate;
	
	private Map<Integer, String> posts;
	int numPosts = 0;
	
	protected User(){
		//Map<Integer, String> posts = new HashMap<Integer, String>();
	}
	
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		 posts = new HashMap<Integer, String>();
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

	public HashMap<Integer, String> savePost(String post) {
		this.posts.put(++numPosts, post);
		HashMap<Integer, String> res = new HashMap<Integer, String>();
		res.put(numPosts, post);
		return res;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate.toString() + ", posts=" + posts.toString() + "]";
	}
	
}
