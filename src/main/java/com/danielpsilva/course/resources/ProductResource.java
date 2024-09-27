package com.danielpsilva.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielpsilva.course.entities.Product;
import com.danielpsilva.course.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {

	@Autowired
	ProductService productService;

	@GetMapping()
	public ResponseEntity<List<Product>> findAll() {
		List<Product> users = productService.findAll();
		return ResponseEntity.ok().body(users);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product user = productService.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
