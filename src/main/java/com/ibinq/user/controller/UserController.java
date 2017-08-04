package com.ibinq.user.controller;

import com.ibinq.user.bean.User;
import com.ibinq.user.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * Created by Administrator on 2017/8/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserDao userDao;


    @RequestMapping("test1")
    public  void test1() {
        User u  = new User();
        u.setId(UUID.randomUUID().toString());
        u.setUsername("张三");
        u.setPassword("123");
        u.setAge(19);
        u.setAddress("安徽");
        u.setEmail("123123123@qq.com");
        u.setPhone("15986869595");

        boolean b = userDao.addUser(u);
        System.out.println(b);
    }
}
