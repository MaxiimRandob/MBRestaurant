package com.mbrestaurant.web.command;

import com.mbrestaurant.web.Page;

import javax.servlet.http.HttpServletRequest;

import static com.mbrestaurant.constants.PageUrlConstants.HOME_PAGE;

public class HomeCommand implements Command
{


	@Override
	public Page perform(final HttpServletRequest request)
	{
		return new Page(HOME_PAGE);
	}
}
