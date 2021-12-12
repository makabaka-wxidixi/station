package com.ailik.station.web.servlet.user; /**
 * @Author mkbk
 * @Description
 * @Create 2021-12-10 21:46
 */

import com.ailik.station.service.servImpl.UserServiceImpl;
import com.ailik.station.service.servInterface.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginUser extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get method");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        if (userService.existUserByUsernamePassword(username, password)) {
            System.out.println("登陆成功");
            request.getRequestDispatcher("/showPhone").forward(request, response);
        } else {
            request.getRequestDispatcher("/login.html").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post method");
        doGet(request, response);
    }

}
