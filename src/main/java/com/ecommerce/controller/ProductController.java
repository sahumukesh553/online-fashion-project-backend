package com.ecommerce.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.impl.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin("http://localhost:4200/")
public class ProductController {
	@Autowired
	private UploadController uploadController;
	@Autowired
	private ProductService productService;
	@GetMapping("/")
	public Collection<Product> getAllProduct()
	{
		return this.productService.getAll();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id)
	{
		return this.productService.getById(id);
	}
@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id,@RequestBody Product product)
	{ if(this.uploadController.getImage()!=null)
	  {
		  product.setProductImage(this.uploadController.getImage());
		 this.uploadController.setImage(null);
	  }
		return this.productService.updateById(product, id);
	}

@PostMapping("/")
public Product addProduct(@RequestBody Product product)
{ if(this.uploadController.getImage()!=null)
  {
	  product.setProductImage(this.uploadController.getImage());
	 this.uploadController.setImage(null);
  }
	return this.productService.create(product);
}


	

}
