package com.trendingtwig.model;

import java.math.BigInteger;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="TWIG_CUSTOMER")
public class Customer {
	
	@Id
	@Column(name = "cust_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private BigInteger custId;
	
	@Column(name = "cust_name")
	private String custName;
	
	@Column(name = "cust_wishlist")
	private ArrayList<Object> custWishlist;
	
	@Column(name = "cust_cart")
	private ArrayList<Object>custCart;
	
	@Column(name = "cust_orders")
	private ArrayList<Object> custOrders;

}
