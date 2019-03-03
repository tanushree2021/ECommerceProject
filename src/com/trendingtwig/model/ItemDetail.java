package com.trendingtwig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@Entity
@Table(name = "TWIG_ITEM_DETAIL")
public class ItemDetail {
	
	
	public ItemDetail(String brand, String size, String color, String material) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.material = material;
	}

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
