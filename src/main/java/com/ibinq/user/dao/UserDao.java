package com.ibinq.user.dao;

import com.ibinq.user.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/8/4.
 */
@Component
public interface UserDao {

    User findUserById(String id);

    List<User> findUsers();

    boolean addUser(User user);

    boolean delUser(String id);

}
