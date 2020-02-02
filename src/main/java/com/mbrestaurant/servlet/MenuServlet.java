package com.mbrestaurant.servlet;

import com.mbrestaurant.service.MenuService;
import com.mbrestaurant.service.impl.MenuServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MenuServlet
	extends HttpServlet
{
	@Override
	protected void doGet(
		HttpServletRequest req,
		HttpServletResponse resp)
		throws
		ServletException,
		IOException
	{

		MenuService menuService = new MenuServiceImpl();
		req.setAttribute("menuItems", menuService.getMenuItems());
		RequestDispatcher view = req.getRequestDispatcher("menu.jsp");
		view.forward(req, resp);
	}

	@Override
	protected void doPost(
		final HttpServletRequest req,
		final HttpServletResponse resp)
		throws
		ServletException,
		IOException
	{
		super.doPost(req, resp);
	}
}
