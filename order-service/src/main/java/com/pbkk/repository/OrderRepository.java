package com.pbkk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbkk.model.Order;
@Repository
public interface OrderRepository extends JpaRepository <Order, Integer> {

}
