package com.mbrestaurant.persistance.model;

public class MenuItem extends Entity
{
	private int price;

	private String name;

	public int getPrice()
	{
		return price;
	}

	public void setPrice(final int price)
	{
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}
}
