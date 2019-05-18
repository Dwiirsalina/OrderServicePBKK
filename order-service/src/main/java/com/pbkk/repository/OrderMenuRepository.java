package com.pbkk.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbkk.model.OrderMenu;

@Repository
public interface OrderMenuRepository extends JpaRepository <OrderMenu, Integer>{
	List<OrderMenu> findByOrderId(Integer order_menu_id);
	Optional<OrderMenu> findByIdAndOrderId(Integer order_menu_id, Integer order_id);
}
