package com.mbrestaurant.persistance.dao;

import com.mbrestaurant.persistance.connection.ConnectionFactory;
import com.mbrestaurant.persistance.model.MenuItem;
import com.mbrestaurant.persistance.model.OrderItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class OrderItemDao implements EntityDao<OrderItem>
{

	private static final String COLUMN_ORDERITEM_ID = "id";
	private static final String COLUMN_COST = "cost";
	private static final String COLUMN_AMOUNT = "amount";
	private static final String COLUMN_MENU_ITEM_ID = "menu_item_id";
	private static final String COLUMN_ORDER_ID = "order_tab_id";

	private static final String SELECT_FROM_ORDERITEM = "SELECT * FROM `order_item`";
	private static final String SELECT_FROM_ORDERITEM_BY_ID = "SELECT * FROM `order_item` WHERE " + COLUMN_ORDERITEM_ID + " = ?";
	private static final String INSERT_INTO_ORDERITEM = "INSERT INTO order_item ("
			+ COLUMN_AMOUNT + ", "
			+ COLUMN_COST + ", "
			+ COLUMN_MENU_ITEM_ID + ", "
			+ COLUMN_ORDER_ID + ", "
			 + ") VALUE (?, ?, ?, ?)";

	private static final String UPDATE_ORDERITEM = "UPDATE order_item SET "
			+ COLUMN_ORDERITEM_ID + "= ?, "
			+ COLUMN_AMOUNT + "= ?, "
			+ COLUMN_COST + "= ?, "
			+ COLUMN_MENU_ITEM_ID + "= ?, "
			+ COLUMN_ORDER_ID + "= ?,  WHERE "
			+ COLUMN_ORDERITEM_ID + " = ?";

	private static final String DELETE_ORDERITEM = "DELETE FROM order_item "
			+ "WHERE " + COLUMN_ORDERITEM_ID + " = ?";

	@Override
	public OrderItem getById(final int id)
	{
		OrderItem item = new OrderItem();
		try(Connection connection = ConnectionFactory.getConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_ORDERITEM_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				item.setId(resultSet.getInt("id"));
				item.setAmount(resultSet.getInt("amount"));
				item.setCost(resultSet.getInt("cost"));
				item.setMenuItemID(resultSet.getInt("menu_item_id"));
				item.setOrderID(resultSet.getInt("order_tab_id"));
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return item;
	}

	@Override
	public List<OrderItem> getAll()
	{
		List<OrderItem> itemList = new LinkedList<>();
		try(Connection connection = ConnectionFactory.getConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_ORDERITEM);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next())
			{
				OrderItem item = new OrderItem();
				item.setId(resultSet.getInt("id"));
				item.setAmount(resultSet.getInt("amount"));
				item.setCost(resultSet.getInt("cost"));
				item.setMenuItemID(resultSet.getInt("menu_item_id"));
				item.setOrderID(resultSet.getInt("order_tab_id"));
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
	public boolean create(final OrderItem entity)
	{
		boolean success = false;
		try(Connection connection = ConnectionFactory.getConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_ORDERITEM);
			preparedStatement.setInt(1, entity.getAmount());
			preparedStatement.setInt(2, entity.getCost());
			preparedStatement.setInt(3, entity.getMenuItemID());
			preparedStatement.setInt(4, entity.getOrderID());
			int result = preparedStatement.executeUpdate();
			success = result != 0;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(final OrderItem entity)
	{
		boolean success = false;
		try(Connection connection = ConnectionFactory.getConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ORDERITEM);
			preparedStatement.setInt(1, entity.getId());
			preparedStatement.setInt(2, entity.getAmount());
			preparedStatement.setInt(3, entity.getCost());
			preparedStatement.setInt(4, entity.getMenuItemID());
			preparedStatement.setInt(5, entity.getOrderID());
			preparedStatement.setInt(6, entity.getId());
			int result = preparedStatement.executeUpdate();
			success = result != 0;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean remove(final int id)
	{
		boolean success = false;
		try(Connection connection = ConnectionFactory.getConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ORDERITEM);
			preparedStatement.setInt(1, id);
			int result = preparedStatement.executeUpdate();
			success = result != 0;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return success;
	}
}
