package com.ailik.station.web.servlet.user;

import com.ailik.station.pojo.User;
import com.ailik.station.service.servImpl.UserServiceImpl;
import com.ailik.station.service.servInterface.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-10 21:43
 */
public class RegisterUser extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("register的get方法");
        //获取用户输入的验证码
        String captcha = req.getParameter("CAPTCHA");
        HttpSession session = req.getSession();
        String code = (String) session.getAttribute("code");
        //验证码错误直接返回
        if (!code.equalsIgnoreCase(captcha)) {
            System.out.println("验证码错误");
            session.setAttribute("code_msg", "验证码错误");
            req.getRequestDispatcher("/register.jsp").forward(req, resp);
            return;
        }
        session.setAttribute("code_msg", "");
        //验证已经通过

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        User user = new User();
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        boolean b = userService.addUser(user);
        if (b) {
            session.setAttribute("username", username);
            System.out.println("添加成功，前往主页");
            resp.sendRedirect("/station/showPhone");//请求重定向
        } else {
            req.getRequestDispatcher("/register.jsp").forward(req, resp);
            System.out.println("添加失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("register的post方法");
        doGet(req, resp);
    }

}
