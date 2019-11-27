package com.mbrestaurant.persistance.model;

public class OrderItem
	extends Entity
{

	private int cost;

	private String amount;

	private int menuItemID;

	private int orderID;

	public OrderItem(
		final int id,
		final int cost,
		final String amount,
		final int menuItemID,
		final int orderID)
	{
		super(id);
		this.cost = cost;
		this.amount = amount;
		this.menuItemID = menuItemID;
		this.orderID = orderID;
	}


	public int getCost()
	{
		return cost;
	}

	public void setCost(final int cost)
	{
		this.cost = cost;
	}

	public String getAmount()
	{
		return amount;
	}

	public void setAmount(final String amount)
	{
		this.amount = amount;
	}

	public int getMenuItemID()
	{
		return menuItemID;
	}

	public void setMenuItemID(final int menuItemID)
	{
		this.menuItemID = menuItemID;
	}

	public int getOrderID()
	{
		return orderID;
	}

	public void setOrderID(final int orderID)
	{
		this.orderID = orderID;
	}
}
