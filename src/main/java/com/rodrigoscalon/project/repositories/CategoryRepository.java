package com.rodrigoscalon.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoscalon.project.entities.Category;


	public interface CategoryRepository extends JpaRepository <Category, Long> {
		
		
	}



