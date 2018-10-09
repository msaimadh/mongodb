package com.capgemini.productapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.productapp.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{

	@Query("{'productCategory':?0}")
	public List<Product> findByProductCategory(String category);
	
	@Query("{'productCategory':?0, 'productPrice': {'$gt': from, '$lt':to}}")
	public List<Product> findProductBycategoryandPrice(String productCategory, double from, double to );

	
}
	
	


