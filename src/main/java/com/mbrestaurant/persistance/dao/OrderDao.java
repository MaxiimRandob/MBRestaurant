package com.mbrestaurant.persistance.dao;

import com.mbrestaurant.persistance.connection.ConnectionFactory;
import com.mbrestaurant.persistance.model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class OrderDao implements EntityDao<Order>
{
	private static final String COLUMN_ORDER_ID = "id";
	private static final String COLUMN_TOTAL = "total";
	private static final String COLUMN_DATE = "date";

	private static final String SELECT_FROM_ORDER = "SELECT * FROM `order_tab`";
	private static final String SELECT_FROM_ORDER_BY_ID = "SELECT * FROM `order_tab` WHERE " + COLUMN_ORDER_ID + " = ?";
	private static final String INSERT_INTO_ORDER = "INSERT INTO order_tab ("
		+ COLUMN_ORDER_ID + ", "
		+ COLUMN_DATE + ", "
		+ COLUMN_TOTAL + ") VALUE ( ?, ?, ?)";

	private static final String UPDATE_ORDER = "UPDATE order_tab "
		+ COLUMN_ORDER_ID + "= ?, "
		+ COLUMN_DATE + "= ?, "
		+ COLUMN_TOTAL + "= ? " + "= ? WHERE "
		+ COLUMN_ORDER_ID + " = ?";

	private static final String DELETE_ORDER = "DELETE FROM order_tab "
		+ "WHERE " + COLUMN_ORDER_ID + " = ?";


	@Override
	public Order getById(final int id)
	{
		Order item = new Order();
		try(Connection connection = ConnectionFactory.getConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_ORDER_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				item.setId(resultSet.getInt("id"));
				item.setDate(resultSet.getDate("date"));
				item.setTotal(resultSet.getInt("total"));
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return item;
	}

	@Override
	public List<Order> getAll()
	{
		List<Order> itemList = new LinkedList<>();
		try(Connection connection = ConnectionFactory.getConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_ORDER);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next())
			{
				Order item = new Order();
				item.setId(resultSet.getInt("id"));
				item.setDate(resultSet.getDate("date"));
				item.setTotal(resultSet.getInt("total"));
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
	public boolean create(final Order entity)
	{
		return false;
	}

	@Override
	public boolean update(final Order entity)
	{
		return false;
	}

	@Override
	public boolean remove(final Order entity)
	{
		return false;
	}
}
