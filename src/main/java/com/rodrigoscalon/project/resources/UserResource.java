package com.rodrigoscalon.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigoscalon.project.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User (1L, "RODRIGO", "rodrigo@gmail.com", "997757026", "123456");
		
		return ResponseEntity.ok().body(u);
		
	}

}
