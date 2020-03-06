package com.mbrestaurant.web.command.menu;

import com.mbrestaurant.service.MenuService;
import com.mbrestaurant.service.impl.MenuServiceImpl;
import com.mbrestaurant.web.Page;
import com.mbrestaurant.web.command.Command;

import javax.servlet.http.HttpServletRequest;

import static com.mbrestaurant.constants.PageUrlConstants.MENU_PAGE;

public class MenuCommandGet
	implements Command
{
	private MenuService menuService;

	public MenuCommandGet()
	{
		this.menuService = new MenuServiceImpl();
	}

	@Override
	public Page perform(final HttpServletRequest request)
	{
		request.setAttribute("menu", menuService.getMenuItems());
		return new Page(MENU_PAGE);
	}
}
