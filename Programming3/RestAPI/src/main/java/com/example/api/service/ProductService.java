package com.example.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.ProductRepository;
import com.example.api.model.Product;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	//get product
	public Product get(int id)
	{
		return repo.findById(id).get();
	}
	
	//get all products
	public List<Product> getAll()
	{
		return repo.findAll();
	}
	
	//delete method
	public void delete(int id)
	{
		repo.deleteById(id);
	}
	
	//add product
	public void add(Product product)
	{
		repo.save(product);
	}
	
	//update
	/*public void update(Product product)
	{
		delete(product.getId());
		//repo.deleteById(product.getId());
		repo.save(product);
	}*/
}
