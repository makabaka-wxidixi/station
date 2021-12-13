package com.ailik.station.web.servlet.goods; /**
 * @Author mkbk
 * @Description
 * @Create 2021-12-13 0:27
 */

import com.ailik.station.dao.implement.PhoneDaoImpl;
import com.ailik.station.pojo.goods.Phone;
import com.ailik.station.service.servImpl.PhoneServiceImpl;
import com.ailik.station.service.servInterface.PhoneService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddNewPhones extends HttpServlet {
    private PhoneService phoneService = new PhoneServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doget被调用");
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        System.out.println("dopost被调用");
        String series = request.getParameter("series");
        String model = request.getParameter("model");
        String price = request.getParameter("price");
        float v = Float.parseFloat(price);
        String brand = request.getParameter("brand");
        String describe = request.getParameter("describe");
        Phone phone = new Phone(series, model, v, brand, describe);
        boolean b = phoneService.addNewPhone(phone);
        System.out.println("添加是否成功：" + b);
        request.setAttribute("newPhone", phone);
        request.getRequestDispatcher("/showPhone").forward(request, response);
    }
}
