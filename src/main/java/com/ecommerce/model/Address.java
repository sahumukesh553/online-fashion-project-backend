package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.ToString;
@Entity
public class Address extends AbstractPersistable<Long> {
	@NotNull(message="city can not be empty")
	private String city;
	@NotNull(message="state can not be empty")
	private String state;
	@NotNull(message="country can not be empty")
	private String country;
	@NotNull(message="pincode can not be empty")
	private String pincode;
	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonBackReference
	private User user;
	private transient Long userId;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
