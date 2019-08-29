package com.lz.dao;

import com.lz.entity.User;

import java.util.List;

/**
 * Created by z on 2018/8/13.
 */
public interface LoginMapper {
    public List<User> getUser(User user);

    public List<User> checkUser(User user);

    public List<User> getStaffid(User user);

    public void insUser(User user);

    public void updUser(User user);
}
