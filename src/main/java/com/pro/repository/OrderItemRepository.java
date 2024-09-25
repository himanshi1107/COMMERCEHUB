package com.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
