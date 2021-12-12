package com.ailik.station.dao.implement;

import com.ailik.station.dao.UserBaseDao;
import com.ailik.station.dao.daoInterface.UserDao;
import com.ailik.station.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-09 21:42
 */
public class UserDaoImpl extends UserBaseDao<User> implements UserDao {


    @Override
    public User getUserByUsername(Connection connection, String username) throws SQLException {
        String sql = "select * from user where `username` = ?";
        User query = query(connection, sql,  username);
        return query;
    }

    @Override
    public boolean addUser(Connection connection, Object... args) throws SQLException {
        String sql = "insert into user(`username`,`password`,`email`) value(?,?,?)";
        boolean update = update(connection, sql, args);
        return update;
    }

    @Override
    public User getUserByNamePassword(Connection connection, String username, String password) throws SQLException {
        String sql = "select * from user where `username` = ? and `password` = ?";
        User query = query(connection, sql,  username, password);
        return query;
    }

    @Override
    public boolean updatePasswordByUsername(Connection connection, String username, String newPassword) throws SQLException {
        String sql = "update user set `password` = ? where `username` = ?";
        boolean update = update(connection, sql, newPassword, username);
        return update;
    }


}
