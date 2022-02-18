package com.ecommerce.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Message;
import com.ecommerce.model.OrderedProduct;
import com.ecommerce.repository.OrderedProductRepository;
import com.ecommerce.service.CommonServiceImpl;
@Service
public class OrderedProductService extends CommonServiceImpl<OrderedProduct>{
@Autowired
private OrderedProductRepository orderedProductRepository;
	@Override
	public Collection<OrderedProduct> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderedProduct getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderedProduct create(OrderedProduct t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderedProduct updateById(OrderedProduct t, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
