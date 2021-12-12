package com.ailik.station.web.servlet.goods; /**
 * @Author mkbk
 * @Description
 * @Create 2021-12-12 17:09
 */

import com.ailik.station.pojo.goods.Phone;
import com.ailik.station.service.servImpl.PhoneServiceImpl;
import com.ailik.station.service.servInterface.PhoneService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ShowPhone extends HttpServlet {
    private PhoneService phoneService = new PhoneServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Phone> allPhone = phoneService.getAllPhone();
        request.setAttribute("phoneList", allPhone);
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
