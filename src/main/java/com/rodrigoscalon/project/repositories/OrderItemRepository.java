package com.rodrigoscalon.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoscalon.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {
	
	

}
