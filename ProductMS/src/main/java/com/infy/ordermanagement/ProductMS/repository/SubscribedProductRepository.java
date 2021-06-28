package com.infy.ordermanagement.ProductMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.ordermanagement.ProductMS.entity.SubscribedProduct;
import com.infy.ordermanagement.ProductMS.utility.CustomPK;

public interface SubscribedProductRepository extends CrudRepository<SubscribedProduct, CustomPK>{

}
