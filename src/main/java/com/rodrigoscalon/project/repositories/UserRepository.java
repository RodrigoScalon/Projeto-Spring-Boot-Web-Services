package com.rodrigoscalon.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoscalon.project.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {
	
	

}
