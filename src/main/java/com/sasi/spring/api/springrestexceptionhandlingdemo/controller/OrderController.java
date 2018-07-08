package com.sasi.spring.api.springrestexceptionhandlingdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.spring.api.springrestexceptionhandlingdemo.exception.OrderServiceException;
import com.sasi.spring.api.springrestexceptionhandlingdemo.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;

	@GetMapping("/getPrice/{productName}")
	public double getOrderPrice(@PathVariable String productName) throws OrderServiceException {
		double amount = service.getPrice(productName);
		return amount;
	}
}
