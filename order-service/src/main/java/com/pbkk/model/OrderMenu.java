package com.pbkk.model;

import java.awt.Menu;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pbkk.service.OrderMenuId;

@Entity
@Table(name="order_menu")
public class OrderMenu {
	private Integer order_id;
	private Integer menu_id;
	
	@Column(nullable = false)
	private Integer order_menu_quantity;
	
	@EmbeddedId
	@JsonIgnore
	private OrderMenuId order_menu_id;
	
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public Integer getOrder_menu_quantity() {
		return order_menu_quantity;
	}
	public void setOrder_menu_quantity(Integer order_menu_quantity) {
		this.order_menu_quantity = order_menu_quantity;
	}
	public OrderMenu(Integer order_id, Integer menu_id, Integer order_menu_quantity, OrderMenuId order_menu_id) {
		super();
		this.order_id = order_id;
		this.menu_id = menu_id;
		this.order_menu_quantity = order_menu_quantity;
		this.order_menu_id = order_menu_id;
	}
	public OrderMenu(Order order, Menu menu, Integer order_menu_quantity) {
        order_menu_id = new OrderMenuId();
        order_menu_id.setOrder(order);
        order_menu_id.setMenu(menu);
        this.order_menu_quantity = order_menu_quantity;
    }
	
	@Transient
    public Menu getMenu() {
        return this.order_menu_id.getMenu();
    }
 
    @Transient
    public Double getTotalPrice() {
        return getMenu().getPrice() * getOrder_menu_quantity();
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menu_id == null) ? 0 : menu_id.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((order_menu_quantity == null) ? 0 : order_menu_quantity.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderMenu other = (OrderMenu) obj;
		if (menu_id == null) {
			if (other.menu_id != null)
				return false;
		} else if (!menu_id.equals(other.menu_id))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (order_menu_quantity == null) {
			if (other.order_menu_quantity != null)
				return false;
		} else if (!order_menu_quantity.equals(other.order_menu_quantity))
			return false;
		return true;
	}
    
    
}
