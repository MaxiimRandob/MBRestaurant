package com.mbrestaurant.web.command;

import com.mbrestaurant.web.Page;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public interface Command
{
	public Page perform(HttpServletRequest request);
}
