package com.mbrestaurant.servlet;

import com.mbrestaurant.service.OrderService;
import com.mbrestaurant.service.impl.OrderServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OrderServlet extends HttpServlet
{
	@Override
	protected void doGet(
		final HttpServletRequest req,
		final HttpServletResponse resp)
		throws
		ServletException,
		IOException
	{
		OrderService service = new OrderServiceImpl();
		req.setAttribute("orders", service.getOrders());
		RequestDispatcher view = req.getRequestDispatcher("orders.jsp");
		view.forward(req, resp);
	}
}
