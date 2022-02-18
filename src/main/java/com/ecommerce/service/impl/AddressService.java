package com.ecommerce.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Address;
import com.ecommerce.model.Message;
import com.ecommerce.repository.AddressRepository;
import com.ecommerce.service.CommonServiceImpl;
@Service
public class AddressService extends CommonServiceImpl<Address> {
@Autowired
private AddressRepository addressRepository;
	@Override
	public Collection<Address> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address create(Address t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address updateById(Address t, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
