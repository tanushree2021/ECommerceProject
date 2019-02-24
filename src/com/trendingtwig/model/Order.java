package com.trendingtwig.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TWIG_ORDER")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long id;
	public Date date;
	public List<Item> itemList;
	public Integer totalItems;
	public BigDecimal totalAmount;
	public String modeOfPayment;
	public Date deliveryDate;
	public String deliveryAddress;
	
}
