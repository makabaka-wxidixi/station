package com.ailik.station.service.servImpl;

import com.ailik.station.dao.daoInterface.UserDao;
import com.ailik.station.dao.implement.UserDaoImpl;
import com.ailik.station.pojo.User;
import com.ailik.station.service.servInterface.UserService;
import com.ailik.station.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-09 23:43
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean existUsername(String username) {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            User user = userDao.getUserByUsername(connection, username);
            if (user != null)
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return false;
    }

    @Override
    public boolean existUserByUsernamePassword(String username, String password) {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            User user = userDao.getUserByNamePassword(connection, username, password);
            if (user != null)
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return false;
    }

    @Override
    public boolean addUser(User user) {
        boolean b = false;
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            b = userDao.addUser(connection, user.getUsername(), user.getPassword(), user.getEmail());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return b;
    }

    @Override
    public boolean updatePassword(String username, String oldPassword, String newPassword) {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            User user = userDao.getUserByNamePassword(connection, username, oldPassword);
            if (user == null) {
                System.out.println("账户不存在或者密码输入错误");
                return false;
            }
            boolean b = userDao.updatePasswordByUsername(connection, username, newPassword);
            return b;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResource(connection);
        }
        return false;
    }
}
