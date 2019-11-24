package com.mbrestaurant.persistance.model;

public class Entity
{
	private int id;

	public Entity()
	{
	}

	public Entity(final int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

	public void setId(final int id)
	{
		this.id = id;
	}
}
