package com.mbrestaurant.dao;

import com.mbrestaurant.persistance.dao.OrderDao;
import com.mbrestaurant.persistance.model.Order;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class OrderDaoTest
{
	OrderDao orderDao = new OrderDao();

	@Test
	public void getAllBasicTest()
	{
		List<Order> testList = new LinkedList<>();

		testList = orderDao.getAll();

		assertNotNull(testList);
	}

	@Test
	public void getByIdBasicTest()
	{
		Order testItem = new Order();

		testItem = orderDao.getById(0);

		assertNotNull(testItem);
	}
}
