package com.ailik.station.web.servlet.user;

import com.ailik.station.service.servImpl.UserServiceImpl;
import com.ailik.station.service.servInterface.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-08 22:11
 */
public class CheckNameServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.得到ajax请求的内容
        String username = req.getParameter("username");
        System.out.println("check get");
        boolean b = userService.existUsername(username);
        if (b) {
            System.out.println("存在用户");
            resp.getWriter().write("true");
        } else {
            System.out.println("不存在该用户");
            resp.getWriter().write("false");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("check post");
        doGet(req, resp);
    }

}
