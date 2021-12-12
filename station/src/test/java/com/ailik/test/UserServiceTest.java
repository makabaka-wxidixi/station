package com.ailik.test;

import com.ailik.station.pojo.User;
import com.ailik.station.service.servImpl.UserServiceImpl;
import com.ailik.station.service.servInterface.UserService;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-10 0:08
 */
class UserServiceTest {
    private UserService userService = new UserServiceImpl();

    @Test
    void existUsername() {
        boolean yasuo = false;
        yasuo = userService.existUsername("username");
        System.out.println(yasuo);
    }

    @Test
    void existUserByUsernamePassword() {
        boolean b = false;
        b = userService.existUserByUsernamePassword("yasuo", "yasuoePass");
        if (!b) {
            System.out.println("用户名不存在");
        }
        System.out.println(b);
    }

    @Test
    void addUser() {
        User user = new User();
        user.setUsername("nuoKe");
        user.setPassword("gailun");
        user.setEmail("nuoKe@qq.com");
        boolean b = userService.addUser(user);
        System.out.println(b);
    }

    @Test
    void updatePassword() {
        boolean b = userService.updatePassword("liu", "asdf", "hy");
        System.out.println(b);
    }
}