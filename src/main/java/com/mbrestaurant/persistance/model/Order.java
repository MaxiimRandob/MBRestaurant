package com.mbrestaurant.persistance.model;

import java.sql.Date;
import java.util.List;

public class Order extends Entity
{
	private int total;

	private Date date;
	
	private List<OrderItem> orderItems;

	public List<OrderItem> getOrderItems()
	{
		return orderItems;
	}

	public void setOrderItems(final List<OrderItem> orderItems)
	{
		this.orderItems = orderItems;
	}

	public int getTotal()
	{
		return total;
	}

	public void setTotal(final int total)
	{
		this.total = total;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(final Date date)
	{
		this.date = date;
	}
}
