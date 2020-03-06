package com.mbrestaurant.web.command.order;

import com.mbrestaurant.service.MenuService;
import com.mbrestaurant.service.impl.MenuServiceImpl;
import com.mbrestaurant.web.Page;
import com.mbrestaurant.web.command.Command;

import javax.servlet.http.HttpServletRequest;

import static com.mbrestaurant.constants.PageUrlConstants.CREATE_ORDER_PAGE;

public class CreateOrderCommandGet implements Command {
    MenuService menuService = new MenuServiceImpl();
    @Override
    public Page perform(HttpServletRequest request) {
        request.setAttribute("menu", menuService.getMenuItems());
        return new Page(CREATE_ORDER_PAGE);
    }
}
