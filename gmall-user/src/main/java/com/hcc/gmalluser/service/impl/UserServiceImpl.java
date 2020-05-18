package com.hcc.gmalluser.service.impl;

import com.hcc.gmalluser.bean.User;

import com.hcc.gmalluser.mapper.UserMapper;
import com.hcc.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        // 使用UserMapper.xml配置文件
        List<User> users = userMapper.selectUserQuery();
        return users;
    }


}
