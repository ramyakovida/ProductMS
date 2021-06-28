package com.infy.ordermanagement.ProductMS.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.infy.ordermanagement.ProductMS.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	public Optional<Product> findByProdId(Integer id);
	
	public Product findByProductName(String name);
	
	public List<Product> findByCategory(String category);
	
	public List<Product> findAll();

}
