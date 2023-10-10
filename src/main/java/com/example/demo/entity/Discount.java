package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="discount601")
public class Discount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int discountId;
	
	private int customerID;
	private float discountRate;
	
	public Discount() {}

	public Discount(int discountID, int customerID, float discountRate) {
		super();
		this.discountId = discountID;
		this.customerID = customerID;
		this.discountRate = discountRate;
	}
	

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public float getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}

}
