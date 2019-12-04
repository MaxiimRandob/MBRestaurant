package com.mbrestaurant.web.command;

import com.mbrestaurant.web.Page;

import javax.servlet.http.HttpServletRequest;

public class NotFoundCommand
	implements Command
{
	@Override
	public Page perform(final HttpServletRequest request)
	{
		return null;
	}
}
