package com.mbrestaurant.web.command.manager;

import com.mbrestaurant.service.OrderService;
import com.mbrestaurant.service.impl.OrderServiceImpl;
import com.mbrestaurant.web.Page;
import com.mbrestaurant.web.command.Command;

import javax.servlet.http.HttpServletRequest;

import static com.mbrestaurant.constants.PageUrlConstants.ORDERS_PAGE;

public class OrderListCommandGet implements Command
{


	private OrderServiceImpl orderService = new OrderServiceImpl();

	@Override
	public Page perform(final HttpServletRequest request)
	{
		request.setAttribute("orders", orderService.getOrders());
		return new Page(ORDERS_PAGE, true);
	}
}
