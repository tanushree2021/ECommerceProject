package com.trendingtwig.cart.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Cart {

	private Long id;

	private String cartMessage;

}
