package com.ailik.station.dao.daoInterface;

import com.ailik.station.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-09 21:28
 */
public interface UserDao {

    /**
     * 通过用户名来获取指定用户
     *
     * @param connection 外部连接
     * @param sql        查询语句
     * @param username   用户名
     * @return null：不存在该用户
     * 否则就返回指定对象
     */
    User getUserByUsername(Connection connection, String username) throws SQLException;

    /**
     * 添加一个
     *
     * @param connection 外部链接——事务
     * @param sql        insert语句
     * @param args       可变形参
     * @return TRUE：添加成功
     */
    boolean addUser(Connection connection, Object... args) throws SQLException;

    /**
     * 通过账号密码获取用户
     *
     * @param connection 外部链接——事务
     * @param sql        select语句
     * @param username   账户
     * @param password   密码
     * @return null：没有指定用户
     */
    User getUserByNamePassword(Connection connection, String username, String password) throws SQLException;

    /**
     * 修改数据
     *
     * @param connection 外部连接——事务
     * @param args       可变形参
     * @return
     */
    boolean updatePasswordByUsername(Connection connection, String username, String newPassword) throws SQLException;

}
