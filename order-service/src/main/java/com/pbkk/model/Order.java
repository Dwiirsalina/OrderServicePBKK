package com.pbkk.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="order")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer order_id;
	
	private Integer customer_id;
	private Integer deals_id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
	private Date order_created = new Date();
	
	private Integer order_status;
	private String delivery_address;
	private String order_note;
	
	@JsonManagedReference
    @OneToMany(mappedBy = "order")
	@Valid
    private List<OrderMenu> orderMenus = new ArrayList<>();
	
	@Transient
	public Double getTotalOrderPrice() {
		double sum = 0;
		List<OrderMenu> orderMenus = getOrderMenus();
			for (OrderMenu om : orderMenus) {
				sum += om.getTotalPrice();
			}
		return sum;
	}
	
	@Transient
	public int getNumberOfMenus() {
		return this.orderMenus.size();
	}
	
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getDeals_id() {
		return deals_id;
	}
	public void setDeals_id(Integer deals_id) {
		this.deals_id = deals_id;
	}
	public Date getOrder_created() {
		return order_created;
	}
	public void setOrder_created(Date order_created) {
		this.order_created = order_created;
	}
	public Integer getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getOrder_note() {
		return order_note;
	}
	public void setOrder_note(String order_note) {
		this.order_note = order_note;
	}

	public Order(Integer order_id, Integer customer_id, Integer deals_id, Date order_created, Integer order_status,
			String delivery_address, String order_note, @Valid List<OrderMenu> orderMenus) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.deals_id = deals_id;
		this.order_created = order_created;
		this.order_status = order_status;
		this.delivery_address = delivery_address;
		this.order_note = order_note;
		this.orderMenus = orderMenus;
	}
	
}
