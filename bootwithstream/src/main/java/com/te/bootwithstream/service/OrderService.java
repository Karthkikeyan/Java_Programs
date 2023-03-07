package com.te.bootwithstream.service;

import java.util.List;

import com.te.bootwithstream.entity.Order;

public interface OrderService {
	
	public Order addOrder(Order order);
	
	public List <Order> getOrder();

}
