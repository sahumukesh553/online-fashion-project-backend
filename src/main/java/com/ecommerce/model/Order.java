package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.ToString;
@Entity(name="order_information")
public class Order extends AbstractPersistable<Long>{
	@Column(name="order_status")
	private String status;
	@Column(name="order_date")
	private LocalDateTime date;

	private Long orderAmount;
	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonBackReference
	private User user;
	@OneToMany(targetEntity = OrderedProduct.class,mappedBy = "order",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<OrderedProduct> product;


	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Long getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<OrderedProduct> getProduct() {
		return product;
	}
	public void setProduct(Set<OrderedProduct> product) {
		this.product = product;
	}

}
