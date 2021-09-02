package com.gary.service;

import com.gary.entity.Order;

public interface OrderService {
	Order createOrder(String username, String product);

	Order queryOrder(String username);
}
