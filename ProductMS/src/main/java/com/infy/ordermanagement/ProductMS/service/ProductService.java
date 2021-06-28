package com.infy.ordermanagement.ProductMS.service;

import java.util.List;

import com.infy.ordermanagement.ProductMS.dto.ProductDTO;
import com.infy.ordermanagement.ProductMS.exception.ProductMSException;

public interface ProductService {
	public Integer addProduct(ProductDTO productDTO) throws ProductMSException;
	
	public String deleteProduct(Integer id) throws ProductMSException;
	
	public ProductDTO getProductByName(String name) throws ProductMSException;
	
	public List<ProductDTO> getProductByCategory(String category) throws ProductMSException;
	
	public ProductDTO getProductById(Integer id) throws ProductMSException;

	public Boolean updateStockOfProd(Integer prodId, Integer quantity) throws ProductMSException;
	
	public List<ProductDTO> viewAllProducts() throws ProductMSException;

}
