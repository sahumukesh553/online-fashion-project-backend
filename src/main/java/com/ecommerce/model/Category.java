package com.ecommerce.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
public class Category extends AbstractPersistable<Long> {
	@NotEmpty(message = "Category name can not be empty")
	private String name;
	@OneToMany(targetEntity = Product.class,mappedBy = "category",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonBackReference
	private Set<Product> products;
	
	

}
