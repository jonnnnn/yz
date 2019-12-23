package com.lz.dao;

import com.lz.entity.User;

import java.util.List;

/**
 * Created by z on 2018/8/13.
 */
public interface LoginMapper {
    List<User> getUser(User user);

    List<User> checkUser(User user);

    List<User> getStaffid(User user);

    void insUser(User user);

    void updUser(User user);

    User getUserByPass(User user);
}
