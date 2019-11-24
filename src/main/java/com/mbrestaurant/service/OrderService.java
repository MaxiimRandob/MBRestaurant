package com.mbrestaurant.service;

import com.mbrestaurant.persistance.model.Order;

import java.util.List;

public interface OrderService
{
	List<Order> getOrders();
}
