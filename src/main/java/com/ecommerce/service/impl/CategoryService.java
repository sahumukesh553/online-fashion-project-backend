package com.ecommerce.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;
import com.ecommerce.model.Message;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.service.CommonServiceImpl;
@Service
public class CategoryService extends CommonServiceImpl<Category> {
@Autowired
private CategoryRepository categoryRepository;
	@Override
	public Collection<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category create(Category t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateById(Category t, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
