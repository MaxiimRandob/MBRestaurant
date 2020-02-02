package com.mbrestaurant.service.impl;

import com.mbrestaurant.persistance.dao.MenuItemDao;
import com.mbrestaurant.persistance.model.MenuItem;

import com.mbrestaurant.service.MenuService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MenuServiceImpl implements MenuService {

    @Override
    public MenuItem getById(int id) {
		MenuItemDao menuItemDao = new MenuItemDao();
        return menuItemDao.getById(id);
    }

    @Override
    public List<MenuItem> getMenuItems() {
        List<MenuItem> menuItems;
        MenuItemDao menuItemDao = new MenuItemDao();
        menuItems = menuItemDao.getAll();
        return menuItems;
    }

    @Override
    public boolean addMenuItem(final MenuItem item) {
        MenuItemDao menuItemDao = new MenuItemDao();
        return menuItemDao.create(item);
    }

    @Override
    public boolean updateMenuItem(MenuItem item) {
        MenuItemDao menuItemDao = new MenuItemDao();
        return menuItemDao.update(item);
    }

    @Override
    public boolean deleteMenuItem(int id) {
        MenuItemDao menuItemDao = new MenuItemDao();
        return menuItemDao.remove(id);
    }

    public static MenuItem getMenuItemFromRequest(HttpServletRequest request) {
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));

        MenuItem item = new MenuItem();

        item.setPrice(price);
        item.setName(name);

        return item;
    }

}
