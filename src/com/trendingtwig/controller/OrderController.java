package com.trendingtwig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trendingtwig.model.Order;
import com.trendingtwig.service.OrderService;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

	private final OrderService orderService;
	
	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public Long placeOrder() {
		return orderService.placeOrder();
	}
	
	public Order reviewOrder(Long id) {
		return orderService.reviewOrder(id);
	}
	
	public Long	updateOrder(Long id) {
		return orderService.updateOrder(id);
	}
	
	public void cancelOrder(Long id) {
		orderService.cancelOrder(id);
	}
	
}
