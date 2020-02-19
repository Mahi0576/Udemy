package com.mahilearnings.webservices.rest.restfulwebservices.controllers;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mahilearnings.webservices.rest.restfulwebservices.beans.User;
import com.mahilearnings.webservices.rest.restfulwebservices.exceptions.UserNotFoundException;
import com.mahilearnings.webservices.rest.restfulwebservices.services.UserService;

@RestController
public class UserController {
	
	@Autowired(required=true)
	private UserService service;
	
	@GetMapping(path="/users")
	public List<User> findAll(){
		return service.findAll();
	}
	
	@GetMapping(path="/users/{id}")
	public User findUser(@PathVariable int id){
		User user = service.findOne(id);
		if(user == null)
			throw new UserNotFoundException("id-"+id+" not found");
		return user;
	}

	@PostMapping(path="/users")
	public ResponseEntity<Object> saveUser( @RequestBody User user ){
		
		// return service.save(user);
		User savedUser = service.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping(path="/users/{userId}/posts")
    public Map<Integer, String> findAllPosts(@PathVariable int userId){
		Map<Integer, String> posts=null;
		posts = service.getAllPosts(userId);
		return posts;
	}
	
	@GetMapping(path="/users/{userId}/posts/{postId}")
    public Map<Integer, String> findUserPost(@PathVariable int userId, @PathVariable int postId){
		Map<Integer, String> post=null;
		post = service.findUserPost(userId, postId);
		return post;
	}
	
	@PostMapping(path="/users/{userId}/posts")
    public Map<Integer, String> saveUserPost(@PathVariable int userId, @PathVariable String post){
		Map<Integer, String> result=null;
		result = service.saveUserPost(userId, post);
		return result;
	}
	
	@DeleteMapping(path="users/{userId}")
	public void deleteUser(@PathVariable int userId){
		User user = service.deleteUser(userId);
		if(user == null)
			throw new UserNotFoundException("id-"+userId);
	}
}
