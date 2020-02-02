package com.mbrestaurant.persistance.dao;

import com.mbrestaurant.persistance.model.OrderItem;

import java.util.List;

public class OrderItemDao implements EntityDao<OrderItem>
{
	@Override
	public OrderItem getById(final int id)
	{
		return null;
	}

	@Override
	public List<OrderItem> getAll()
	{
		//Получение всех елементов ордера по айди ордера
		return null;
	}

	@Override
	public boolean create(final OrderItem entity)
	{
		// добавление елемента ордера в базу
		return false;
	}

	@Override
	public boolean update(final OrderItem entity)
	{
		return false;
	}

	@Override
	public boolean remove(final int id)
	{
		return false;
	}
}
