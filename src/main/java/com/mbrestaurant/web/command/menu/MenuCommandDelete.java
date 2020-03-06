package com.mbrestaurant.web.command.menu;

import com.mbrestaurant.service.MenuService;
import com.mbrestaurant.service.impl.MenuServiceImpl;
import com.mbrestaurant.web.Page;
import com.mbrestaurant.web.command.Command;

import javax.servlet.http.HttpServletRequest;

import static com.mbrestaurant.constants.PageUrlConstants.MENU_PAGE;

public class MenuCommandDelete implements Command {

    MenuService menuService = new MenuServiceImpl();
    @Override
    public Page perform(HttpServletRequest request) {
        menuService.deleteMenuItem(Integer.parseInt(request.getParameter("id")));
        return new Page(MENU_PAGE, true);
    }
}
