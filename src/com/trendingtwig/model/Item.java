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
@Entity
@Table(name = "TWIG_ITEM")
public class Item {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "image_Path")
	private String imagePath;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "category")
	private String category;

	@Column(name = "sub_Category")
	private String subCategory;

}
