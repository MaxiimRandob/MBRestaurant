package com.mbrestaurant.factory;

import com.mbrestaurant.web.command.Command;
import com.mbrestaurant.web.command.HomeCommand;
import com.mbrestaurant.web.command.menu.*;
import com.mbrestaurant.web.command.NotFoundCommand;
import com.mbrestaurant.web.command.order.CreateOrderCommandGet;
import com.mbrestaurant.web.command.order.OrderListCommandGet;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory
{
	private static Map<String, Command> getCommandMap = new HashMap<>();
	private static Map<String, Command> postCommandMap = new HashMap<>();
	private static Command defaultCommand = new NotFoundCommand();

	static {

		//--------- GET commands ----------//
		getCommandMap.put("/create-order", new CreateOrderCommandGet());
		getCommandMap.put("/update-menu-item", new MenuCommandUpdate());
		getCommandMap.put("/add-menu-item", new ShowMenuItemAddForm());
		getCommandMap.put("/orders", new OrderListCommandGet());
		getCommandMap.put("/menu", new MenuCommandGet());
		getCommandMap.put("/delete-menu-item", new MenuCommandDelete());
		getCommandMap.put("/", new HomeCommand());


		//--------- POST commands ----------//
		postCommandMap.put("/add-menu-item", new MenuItemCommandPost());
		postCommandMap.put("/update-menu-item", new MenuCommandUpdate());
	}

	private CommandFactory() {
	}

	public static Command getCommand(String path, String type) {
		return "GET".equals(type)
			? getCommand(path)
			: postCommand(path);
	}

	private static Command getCommand(String path) {
		return getCommandMap.getOrDefault(path, defaultCommand);
	}

	private static Command postCommand(String path) {
		return postCommandMap.getOrDefault(path, defaultCommand);
	}
}
