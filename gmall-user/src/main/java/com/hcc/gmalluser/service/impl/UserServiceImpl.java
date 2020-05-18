package com.hcc.gmalluser.service.impl;

import com.hcc.gmalluser.bean.UmsMember;

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
    public List<UmsMember> getUserList() {
        // 使用UserMapper.xml配置文件
        List<UmsMember> users = userMapper.selectUserQuery();
        return users;
    }
    @Override
    public List<UmsMember> getUserListByMapper() {
        // 使用通用mapper
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMember> getUserListById(String id) {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(id);
        List<UmsMember> select = userMapper.select(umsMember);
        return select;
    }


}
