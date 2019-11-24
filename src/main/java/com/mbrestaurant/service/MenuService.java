package com.mbrestaurant.service;

import com.mbrestaurant.persistance.model.MenuItem;

import java.awt.*;
import java.util.List;

public interface MenuService
{
	List<MenuItem> getMenuItems();
}
