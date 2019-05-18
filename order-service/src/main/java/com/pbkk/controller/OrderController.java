package com.pbkk.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pbkk.model.Order;
import com.pbkk.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@ResponseBody
	@GetMapping(value = "/all")
	public List <Order> getAllOrders() {
		return orderService.getAllOrders();
	}
	
//	@ResponseBody
//	@RequestMapping(value = "/create", method = RequestMethod.POST) 
//	public Map<String, Object> createOrder(
//			@RequestBody Order orders) {
//
//		Map<String, Object> map = new LinkedHashMap<>();
//		return (Map<String, Object>) orderService.createOrder(orders);
//	}
}

   