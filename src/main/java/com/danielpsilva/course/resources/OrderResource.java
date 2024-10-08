package com.danielpsilva.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielpsilva.course.entities.Order;
import com.danielpsilva.course.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderResource {

	@Autowired
	OrderService orderService;

	@GetMapping()
	public ResponseEntity<List<Order>> findAll() {
		List<Order> users = orderService.findAll();
		return ResponseEntity.ok().body(users);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order user = orderService.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
