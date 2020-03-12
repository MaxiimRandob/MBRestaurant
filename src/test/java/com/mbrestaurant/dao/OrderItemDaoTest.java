package com.mbrestaurant.dao;

import com.mbrestaurant.persistance.dao.OrderItemDao;
import com.mbrestaurant.persistance.model.MenuItem;
import com.mbrestaurant.persistance.model.OrderItem;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class OrderItemDaoTest {
    OrderItemDao orderItemDao = new OrderItemDao();

    @Test
    public void getAllBasicTest()
    {
        List<OrderItem> testList;

        testList = orderItemDao.getAll();

        assertNotNull(testList);
    }

    @Test
    public void getByIdBasicTest()
    {
        OrderItem testItem;

        testItem = orderItemDao.getById(0);

        assertNotNull(testItem);
    }
}
