package com.pbkk.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbkk.model.Order;
import com.pbkk.repository.OrderRepository;

@Service
//@Transactional
public class OrderServiceImpl implements OrderService {
	
	@Autowired 
	OrderRepository orderRepository;
	
	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}
    
//    @Override
//    public Order getOrder(Integer order_id) {
//    	return orders.stream()
//    			.filter(x -> x.getOrder_id() == order_id)
//    			.findAny()
//    			.orElse(null);
//    }
     
//    @Override
//    public Order createOrder(Order order) {
//    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd@HH:mm:ss.SSSZ");
//    	Date date = new Date();
//        return (Order) this.orderRepository.save(order);
//    }
// 
//    @Override
//    public void updateOrder(Order order) {
//        this.orderRepository.save(order);
//    }
//    
//    @Override
//    public void deleteOrder(Order order) {
//    	
//    }
}