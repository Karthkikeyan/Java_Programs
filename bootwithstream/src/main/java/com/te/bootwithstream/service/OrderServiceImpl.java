package com.te.bootwithstream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.bootwithstream.entity.Order;
import com.te.bootwithstream.repository.OrderDAO;

@Service
public class OrderServiceImpl  implements OrderService{

	@Autowired
	private OrderDAO odao;
	@Override
	public Order addOrder(Order order) {
		
		return odao.save(order);
	}
	@Override
	public List<Order> getOrder() {
		
		return  odao.findAll();
	}

}
