package com.ecommerce.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Message;
import com.ecommerce.model.Role;
import com.ecommerce.repository.RoleRepository;
import com.ecommerce.service.CommonServiceImpl;
@Service
public class RoleService extends CommonServiceImpl<Role> {
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Collection<Role> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role create(Role t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role updateById(Role t, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
