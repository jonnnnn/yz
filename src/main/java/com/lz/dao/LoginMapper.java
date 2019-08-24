package com.lz.dao;

import com.lz.entity.User;

/**
 * Created by z on 2018/8/13.
 */
public interface LoginMapper {
    public User getUser(String userid);
}
