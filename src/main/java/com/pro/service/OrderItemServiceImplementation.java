package com.pro.service;

import org.springframework.stereotype.Service;

import com.pro.model.OrderItem;
import com.pro.repository.OrderItemRepository;

@Service
public class OrderItemServiceImplementation implements OrderItemService{

	private OrderItemRepository orderItemRepository;

	public OrderItemServiceImplementation(OrderItemRepository orderItemRepository) {
		super();
		this.orderItemRepository = orderItemRepository;
	}

	@Override
	public OrderItem createOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemRepository.save(orderItem);
	}
}
