package com.mbrestaurant.web.command.menu;

import com.mbrestaurant.web.Page;
import com.mbrestaurant.web.command.Command;

import javax.servlet.http.HttpServletRequest;

import static com.mbrestaurant.constants.PageUrlConstants.ADD_MENU_ITEM_PAGE;

public class ShowMenuItemAddForm implements Command
{
	@Override
	public Page perform(final HttpServletRequest request)
	{
		return new Page(ADD_MENU_ITEM_PAGE);
	}
}
