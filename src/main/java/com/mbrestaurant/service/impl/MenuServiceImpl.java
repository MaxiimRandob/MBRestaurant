package com.mbrestaurant.service.impl;

import com.mbrestaurant.persistance.dao.MenuItemDao;
import com.mbrestaurant.persistance.model.MenuItem;

import com.mbrestaurant.service.MenuService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MenuServiceImpl implements MenuService
{

	@Override
	public List<MenuItem> getMenuItems()
	{
		List<MenuItem> menuItems;
		MenuItemDao menuItemDao = new MenuItemDao();
		menuItems = menuItemDao.getAll();
		return menuItems;
	}
}
