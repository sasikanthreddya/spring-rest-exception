package com.sasi.spring.api.springrestexceptionhandlingdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasi.spring.api.springrestexceptionhandlingdemo.model.Order;

public interface OrderDAO extends JpaRepository<Order, Integer>{

	Order findByName(String name);

}
