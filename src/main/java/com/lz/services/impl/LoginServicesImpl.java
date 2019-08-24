package com.lz.services.impl;

import com.lz.dao.LoginMapper;
import com.lz.entity.User;
import com.lz.services.LoginServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by z on 2018/8/13.
 */
@Service("LoginServices")
public class LoginServicesImpl implements LoginServices {
    @Resource
    private LoginMapper loginMapper;
    @Override
    public User getUser(String userid) {
        return loginMapper.getUser(userid);
    }
}
