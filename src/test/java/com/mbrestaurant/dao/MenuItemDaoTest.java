package com.mbrestaurant.dao;

import com.mbrestaurant.persistance.dao.MenuItemDao;
import com.mbrestaurant.persistance.model.MenuItem;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class MenuItemDaoTest
{
	MenuItemDao menuItemDao = new MenuItemDao();

	@Test
	public void getAllBasicTest()
	{
		List<MenuItem> testList;

		testList = menuItemDao.getAll();

		assertNotNull(testList);
	}

	@Test
	public void getByIdBasicTest()
	{
		MenuItem testItem;

		testItem = menuItemDao.getById(0);

		assertNotNull(testItem);
	}

}
