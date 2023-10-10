package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order601")
public class Order {
	
	
	
	private int customerID;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderID;
	private Date orderDate;
	private String product;
	private int quantity;
	
	public Order() {}

	public Order(int customerID, int orderID, Date orderDate, String product, int quantity) {
		super();
		this.customerID = customerID;
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.product = product;
		this.quantity = quantity;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
