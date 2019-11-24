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
		return null;
	}

	@Override
	public boolean create(final OrderItem entity)
	{
		return false;
	}

	@Override
	public boolean update(final OrderItem entity)
	{
		return false;
	}

	@Override
	public boolean remove(final OrderItem entity)
	{
		return false;
	}
}
