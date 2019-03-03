package com.trendingtwig.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@Entity
@Table(name = "TWIG_ITEM")
public class Item {

	
	public Item(String name, String description, BigDecimal price, String imagePath, Integer quantity, String category,
			String subCategory, ItemDetail itemDetail) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.imagePath = imagePath;
		this.quantity = quantity;
		this.category = category;
		this.subCategory = subCategory;
		this.itemDetail = itemDetail;
	}
	

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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ITEM_DETAIL_ID")
	private ItemDetail itemDetail;
}
