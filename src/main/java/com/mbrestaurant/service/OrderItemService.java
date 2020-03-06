package com.mbrestaurant.service;

import com.mbrestaurant.persistance.model.MenuItem;
import com.mbrestaurant.persistance.model.Order;
import com.mbrestaurant.persistance.model.OrderItem;

import java.util.List;

public interface OrderItemService {

    List<OrderItem> getOrderItems(int orderId);

    boolean addOrderItem(OrderItem item);

}
