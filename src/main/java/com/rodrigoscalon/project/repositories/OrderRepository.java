package com.rodrigoscalon.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoscalon.project.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {
	
	
}
