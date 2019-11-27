package com.mbrestaurant.service.impl;

import com.mbrestaurant.persistance.dao.OrderDao;
import com.mbrestaurant.persistance.model.Order;
import com.mbrestaurant.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService
{
	@Override
	public List<Order> getOrders()
	{
		List<Order> orders;
		OrderDao orderDao = new OrderDao();
		orders = orderDao.getAll();
		return orders;
	}
}
