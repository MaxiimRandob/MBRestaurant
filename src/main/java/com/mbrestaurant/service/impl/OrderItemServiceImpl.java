package com.mbrestaurant.service.impl;

import com.mbrestaurant.persistance.model.MenuItem;
import com.mbrestaurant.persistance.model.OrderItem;
import com.mbrestaurant.service.OrderItemService;
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.servlet.http.HttpServletRequest;
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

    public static OrderItem getOrderItemFromRequest(HttpServletRequest request) {
        String name = request.getParameter("itemName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));






        return null;
    }
}
