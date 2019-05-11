package com.pbkk.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pbkk.model.Order;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
 
    @Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }
     
    @Override
    public Order create(Order order) {
        order.setOrder_created(Date.now());
        return this.orderRepository.save(order);
    }
 
    @Override
    public void update(Order order) {
        this.orderRepository.save(order);
    }
}