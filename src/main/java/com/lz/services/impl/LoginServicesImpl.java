package com.lz.services.impl;

import com.lz.dao.LoginMapper;
import com.lz.entity.User;
import com.lz.services.LoginServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by z on 2018/8/13.
 */
@Service("LoginServices")
public class LoginServicesImpl implements LoginServices {
    @Resource
    private LoginMapper loginMapper;
    @Override
    public List<User> getUser(User user) {
        return loginMapper.getUser(user);
    }

    @Override
    public List<User> checkUser(User user) {
        return loginMapper.checkUser(user);
    }

    @Override
    public List<User> getStaffid(User user) {
        return loginMapper.getStaffid(user);
    }

    @Override
    public void insUser(User user) {
        loginMapper.insUser(user);
    }

    @Override
    public void updUser(User user) {
        loginMapper.updUser(user);
    }
}
