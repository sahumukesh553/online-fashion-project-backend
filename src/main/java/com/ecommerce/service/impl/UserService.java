package com.ecommerce.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Message;
import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.CommonServiceImpl;
@Service
public class UserService extends CommonServiceImpl<User> {
@Autowired
private UserRepository userRepository;
@Autowired
private PasswordEncoder passwordEncoder;
	@Override
	public Collection<User> getAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getById(Long id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public User create(User t) {
		t.setPassword(passwordEncoder.encode(t.getPassword()));
		User save = userRepository.save(t);
		return save;
	}

	@Override
	public User updateById(User t, Long id) {
		// TODO Auto-generated method stub
		User user = this.userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
		if(t.getName()!=null)
			user.setName(t.getName());
		
		if(t.getNumber()!=null)
			user.setNumber(t.getNumber());
		
		if(t.getEmail()!=null)
			user.setEmail(t.getEmail());
		if(t.getPassword()!=null)
			user.setPassword(passwordEncoder.encode(t.getPassword()));
		if(t.getProfileImage()!=null)
		user.setProfileImage(t.getProfileImage());
		
		return this.userRepository.save(user);
	}

	@Override
	public Message deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
