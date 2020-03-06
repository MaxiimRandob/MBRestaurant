package com.mbrestaurant.web.command.order;

import com.mbrestaurant.service.OrderService;
import com.mbrestaurant.service.impl.OrderServiceImpl;
import com.mbrestaurant.web.Page;
import com.mbrestaurant.web.command.Command;

import javax.servlet.http.HttpServletRequest;

import static com.mbrestaurant.constants.PageUrlConstants.ORDERS_PAGE;

public class OrderListCommandGet
	implements Command
{

	private OrderService orderService;

	public OrderListCommandGet()
	{
		this.orderService = new OrderServiceImpl();
	}

	@Override
	public Page perform(HttpServletRequest request)
	{
		request.setAttribute("orders", orderService.getOrders());
		return new Page(ORDERS_PAGE);
	}
}
