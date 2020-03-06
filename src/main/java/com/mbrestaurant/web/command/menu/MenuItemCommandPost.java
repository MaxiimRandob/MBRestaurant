package com.mbrestaurant.web.command.menu;

import com.mbrestaurant.persistance.model.MenuItem;
import com.mbrestaurant.service.MenuService;
import com.mbrestaurant.service.impl.MenuServiceImpl;
import com.mbrestaurant.web.Page;
import com.mbrestaurant.web.command.Command;

import javax.servlet.http.HttpServletRequest;

import static com.mbrestaurant.constants.PageUrlConstants.MENU_PAGE;

public class MenuItemCommandPost
	implements Command
{

	MenuService service = new MenuServiceImpl();

	@Override
	public Page perform(final HttpServletRequest request)
	{
		MenuItem item = MenuServiceImpl.getMenuItemFromRequest(request);
		service.addMenuItem(item);
		return new Page(MENU_PAGE, true);
	}
}
