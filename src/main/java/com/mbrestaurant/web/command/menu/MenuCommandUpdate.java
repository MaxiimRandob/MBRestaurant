package com.mbrestaurant.web.command.menu;

import com.mbrestaurant.persistance.model.MenuItem;
import com.mbrestaurant.service.MenuService;
import com.mbrestaurant.service.impl.MenuServiceImpl;
import com.mbrestaurant.web.Page;
import com.mbrestaurant.web.command.MultipleMethodCommand;

import javax.servlet.http.HttpServletRequest;

import static com.mbrestaurant.constants.PageUrlConstants.MENU_PAGE;
import static com.mbrestaurant.constants.PageUrlConstants.UPDATE_MENU_ITEM_PAGE;

public class MenuCommandUpdate extends MultipleMethodCommand
{

	 MenuService menuService = new MenuServiceImpl();

	@Override
	protected Page performGet(final HttpServletRequest request)
	{
		MenuItem item = menuService.getById(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("item", item);
		return new Page(UPDATE_MENU_ITEM_PAGE);
	}

	@Override
	protected Page performPost(final HttpServletRequest request)
	{
		MenuItem item = MenuServiceImpl.getMenuItemFromRequest(request);
		item.setId(Integer.parseInt(request.getParameter("id")));
		menuService.updateMenuItem(item);
		return new Page(MENU_PAGE, true);
	}

}
