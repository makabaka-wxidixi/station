package com.ailik.test;

import com.ailik.station.dao.implement.UserDaoImpl;
import com.ailik.station.pojo.User;
import com.ailik.station.utils.JdbcUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-09 22:03
 */
class UserDaoTest {

    private UserDaoImpl userDao = new UserDaoImpl();

    @Test
    void getUserByUsername() {
        User yasuo = null;
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            yasuo = userDao.getUserByUsername(connection, "ydasuo");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        System.out.println(yasuo);
    }

    @Test
    void addUser() {
        Connection connection = null;
        boolean b = false;
        try {
            connection = JdbcUtils.getConnection();
            b = userDao.addUser(connection, "yasudadsfo", "yasuoPass", "yasuo@qq.com");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        System.out.println(b);
    }

    @Test
    void getUserByNamePassword() {
        User userByNamePassword = null;
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            userByNamePassword = userDao.getUserByNamePassword(connection, "yasuoe", "yasuoPass");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        System.out.println(userByNamePassword);
    }
}