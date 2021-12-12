package com.ailik.station.service.servInterface;

import com.ailik.station.pojo.User;

import java.sql.SQLException;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-09 23:33
 */
public interface UserService {
    /**
     * 判断账号是否已经存在
     *
     * @param username 要判断的用户名
     * @return true：用户名已存在
     */
    boolean existUsername(String username);

    /**
     * 判断账号密码是否正确
     *
     * @param username 用户名
     * @param password 密码
     * @return true：用户存在
     */
    boolean existUserByUsernamePassword(String username, String password);

    /**
     * 新增用户
     *
     * @param user 要添加的新用户
     * @return true：添加成功
     */
    boolean addUser(User user);

    /**
     * 修改指定用户密码
     *
     * @param username    用户名
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @return true：修改成功
     */
    boolean updatePassword(String username, String oldPassword, String newPassword);
}
