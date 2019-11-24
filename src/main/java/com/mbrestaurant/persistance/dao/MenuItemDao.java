package com.mbrestaurant.persistance.dao;

import com.mbrestaurant.persistance.connection.ConnectionFactory;
import com.mbrestaurant.persistance.model.MenuItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class MenuItemDao implements EntityDao<MenuItem>
{
	private static final String COLUMN_MENUITEM_ID = "id";
	private static final String COLUMN_PRICE = "price";
	private static final String COLUMN_NAME = "name";

	private static final String SELECT_FROM_MENUITEM = "SELECT * FROM `menuitem`";
	private static final String SELECT_FROM_MENUITEM_BY_ID = "SELECT * FROM `menuitem` WHERE " + COLUMN_MENUITEM_ID + " = ?";
	private static final String INSERT_INTO_MENUITEM = "INSERT INTO menuitem ("
		+ COLUMN_MENUITEM_ID + ", "
		+ COLUMN_PRICE + ", "
		+ COLUMN_NAME + ") VALUE ( ?, ?, ?)";

	private static final String UPDATE_MENUITEM = "UPDATE menuitem "
		+ COLUMN_MENUITEM_ID + "= ?, "
		+ COLUMN_PRICE + "= ?, "
		+ COLUMN_NAME + "= ? " + "= ? WHERE "
		+ COLUMN_MENUITEM_ID + " = ?";

	private static final String DELETE_MENUITEM = "DELETE FROM menuitem "
		+ "WHERE " + COLUMN_MENUITEM_ID + " = ?";

	@Override
	public MenuItem getById(
		final int id)
	{
		MenuItem item = new MenuItem();
		try(Connection connection = ConnectionFactory.getConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_MENUITEM_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				item.setId(resultSet.getInt("id"));
				item.setName(resultSet.getString("name"));
				item.setPrice(resultSet.getInt("price"));
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return item;
	}

	@Override
	public List<MenuItem> getAll()
	{
		List<MenuItem> itemList = new LinkedList<>();
		try(Connection connection = ConnectionFactory.getConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_MENUITEM);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next())
			{
				MenuItem item = new MenuItem();
				item.setId(resultSet.getInt("id"));
				item.setName(resultSet.getString("name"));
				item.setPrice(resultSet.getInt("price"));
				itemList.add(item);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return itemList;
	}

	@Override
	public boolean create(final MenuItem entity)
	{
		return false;
	}

	@Override
	public boolean update(final MenuItem entity)
	{
		return false;
	}

	@Override
	public boolean remove(final MenuItem entity)
	{
		return false;
	}

}
