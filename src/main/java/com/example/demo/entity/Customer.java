package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer601")
public class Customer {
	
	@Id
	private int customerID;
	
	private String name;
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerID", referencedColumnName="customerID")
	private Discount discount;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customerID", referencedColumnName="customerID")
	private List<Order> orders;
	
	public Customer() {}

	public Customer(int customerID, String name, String email, Discount discount, List<Order> orders) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.email = email;
		this.discount = discount;
		this.orders = orders;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
