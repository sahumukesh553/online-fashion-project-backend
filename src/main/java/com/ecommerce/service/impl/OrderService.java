package com.ecommerce.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Message;
import com.ecommerce.model.Order;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.CommonServiceImpl;
@Service
public class OrderService extends CommonServiceImpl<Order> {
@Autowired
private OrderRepository orderRepository;
	@Override
	public Collection<Order> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order create(Order t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateById(Order t, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
