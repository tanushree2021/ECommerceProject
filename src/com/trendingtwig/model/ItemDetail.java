package com.trendingtwig.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
//@Entity
//@Table(name = "TWIG_ITEM_DETAIL")
public class ItemDetail {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "brand")
	private String brand;

	@Column(name = "size")
	private String size;

	@Column(name = "color")
	private String color;

	@Column(name = "material")
	private String material;

}
