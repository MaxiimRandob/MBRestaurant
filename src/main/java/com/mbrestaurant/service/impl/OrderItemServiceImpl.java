package com.mbrestaurant.service.impl;

import com.mbrestaurant.persistance.model.OrderItem;
import com.mbrestaurant.service.OrderItemService;

import java.util.List;

public class OrderItemServiceImpl  implements OrderItemService {

    @Override
    public List<OrderItem> getOrderItems(int orderId) {
        // Получения всех елементов ордера для конкретного ордера
        return null;
    }

    @Override
    public boolean addOrderItem(OrderItem item) {

        //Сборка елемента ордера и передача в Dao
        return false;
    }
}
