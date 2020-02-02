package com.mbrestaurant.service;

import com.mbrestaurant.persistance.model.MenuItem;

import java.awt.*;
import java.util.List;

public interface MenuService {
    MenuItem getById(int id);

    List<MenuItem> getMenuItems();

    boolean addMenuItem(MenuItem item);

    boolean updateMenuItem(MenuItem item);

    boolean deleteMenuItem(int id);

}
