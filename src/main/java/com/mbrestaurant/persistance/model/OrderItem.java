package com.mbrestaurant.persistance.model;

public class OrderItem
	extends Entity
{

	private int cost;

	private int amount;

	private int menuItemID;

	private int orderID;

	public OrderItem() {
	}

	public OrderItem(
		final int id,
		final int cost,
		final int amount,
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

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(final int amount)
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
