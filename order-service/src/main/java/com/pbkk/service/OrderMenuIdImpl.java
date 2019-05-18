package com.pbkk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pbkk.model.Order;
import com.pbkk.model.OrderMenu;
import com.pbkk.repository.OrderMenuRepository;
import com.pbkk.repository.OrderRepository;

public class OrderMenuIdImpl {
	@Autowired 
	OrderMenuRepository orderMenuRepository;
	
	public List<OrderMenu> getAllMenuOrders() {
		return orderMenuRepository.findAll();
	}

}

