package com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Product;
import com.example.api.service.ProductService;

@RestController
public class ProductServiceController {

	/*private static Map<String, Product> productRepo = new HashMap<>();
	

	static {
		Product honey = new Product();
		honey.setId("1");
		honey.setName("Honey");
		productRepo.put(honey.getId(), honey);
		
		Product almond = new Product();
		almond.setId("2");
		almond.setName("Almond");
		productRepo.put(almond.getId(), almond);
		
		Product peanut = new Product();
		peanut.setId("3");
		peanut.setName("peanut");
		productRepo.put(peanut.getId(), peanut);	
	}*/
	@Autowired
	private ProductService service;
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable("id") int id)
	{
		service.delete(id);
		return new ResponseEntity<>("Product is deleted successfully", HttpStatus.OK);
			
	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateProduct(@PathVariable("id") int id, @RequestBody Product product)
	{
		
		product.setId(id);
		//product = service.get(id);
		service.add(product);
		
		return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
			
	}
	
	
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public ResponseEntity<Object> createProduct(@RequestBody Product product)
	{
		service.add(product);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
			
	}
	
	@RequestMapping(value="/products")
	public ResponseEntity<Object> getProduct()
	{
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
			
	}	
}
