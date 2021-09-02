package com.gary.service.impl;

import com.gary.entity.Order;
import com.gary.service.OrderService;

/**
 * @author liqiang
 * @date 2021/09/01 16:31
 **/
public class OrderServiceImpl implements OrderService {

	@Override
	public Order createOrder(String username, String product) {
		Order order = new Order();
		order.setUsername(username);
		order.setProduct(product);
		return order;
	}

	@Override
	public Order queryOrder(String username) {
		Order order = new Order();
		order.setUsername("test");
		order.setProduct("test");
		return order;
	}

}
