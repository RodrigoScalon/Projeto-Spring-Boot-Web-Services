package com.rodrigoscalon.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoscalon.project.entities.Product;


	public interface ProductRepository extends JpaRepository <Product, Long> {
		
		
	}



