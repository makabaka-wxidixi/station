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
            String checkbox = request.getParameter("checkbox");
            if ("1".equals(checkbox)) {//说明用户确定记住密码
                //创建cookie——记住我
                Cookie cookie1 = new Cookie("username", username);
                Cookie cookie2 = new Cookie("password", password);
                response.addCookie(cookie1);
                response.addCookie(cookie2);
            }
            //设置session——xxx，欢迎您
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            String contextPath = request.getContextPath();
            System.out.println(contextPath);
            response.sendRedirect(contextPath + "/showPhone");//请求重定向
        } else {
            //登录失败
            //提示用户密码错误
            request.setAttribute("password_error", "密码错误!");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post method");
        doGet(request, response);
    }

}
