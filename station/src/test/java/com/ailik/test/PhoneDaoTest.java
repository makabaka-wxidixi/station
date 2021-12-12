package com.ailik.test;

import com.ailik.station.dao.daoInterface.PhoneDao;
import com.ailik.station.dao.implement.PhoneDaoImpl;
import com.ailik.station.pojo.goods.Phone;
import com.ailik.station.utils.JdbcUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-12 20:29
 */
class PhoneDaoTest {

    private PhoneDao phoneDao = new PhoneDaoImpl();

    @Test
    void getPhoneListBySeriesAsc() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        List<Phone> phoneListBySeriesAsc = phoneDao.getPhoneListBySeriesAsc(connection, "iphone");
        System.out.println(phoneListBySeriesAsc);
    }

    @Test
    void getPhoneListBySeriesDesc() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        List<Phone> phoneListBySeriesAsc = phoneDao.getPhoneListBySeriesDesc(connection, "iphone");
        System.out.println(phoneListBySeriesAsc);
    }

    @Test
    void getPhoneByModel() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        Phone phoneByModel = phoneDao.getPhoneByModel(connection, "p40-pro");
        System.out.println(phoneByModel);
    }

    @Test
    void getAllPhoneByBrandAsc() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        List<Phone> oppo = phoneDao.getAllPhoneByBrandAsc(connection, "OPPO");
        System.out.println(oppo);
    }

    @Test
    void getAllPhoneByBrandDesc() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        List<Phone> oppo = phoneDao.getAllPhoneByBrandDesc(connection, "OPPO");
        System.out.println(oppo);
    }

    @Test
    void getAllPhoneByASC() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        List<Phone> oppo = phoneDao.getAllPhoneByPriceASC(connection);
        for (int i = 0; i < oppo.size(); i++) {
            System.out.println(oppo.get(i));
        }
    }

    @Test
    void getAllPhoneByDesc() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        List<Phone> oppo = phoneDao.getAllPhoneByPriceDesc(connection);
        for (int i = 0; i < oppo.size(); i++) {
            System.out.println(oppo.get(i));
        }
    }

    @Test
    void getAllPhoneByHotAsc() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        List<Phone> allPhoneByHotAsc = phoneDao.getAllPhoneByHotAsc(connection);
        for (int i = 0; i < allPhoneByHotAsc.size(); i++) {
            System.out.println(allPhoneByHotAsc.get(i));
        }
    }

    @Test
    void getAllPhoneByHotDesc() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        List<Phone> allPhoneByHotDesc = phoneDao.getAllPhoneByHotDesc(connection);
        for (int i = 0; i < allPhoneByHotDesc.size(); i++) {
            System.out.println(allPhoneByHotDesc.get(i));
        }
    }
}