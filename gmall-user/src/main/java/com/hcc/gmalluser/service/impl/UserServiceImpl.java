package com.hcc.gmalluser.service.impl;

import com.hcc.gmall.bean.UmsMember;

import com.hcc.gmall.bean.UmsMemberReceiveAddress;
import com.hcc.gmall.service.UserService;//api

import com.hcc.gmalluser.mapper.UserAdressMapper;
import com.hcc.gmalluser.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserAdressMapper userAdressMapper;

    @Override
    public List<UmsMember> getUserList() {
        // 使用UserMapper.xml配置文件
        List<UmsMember> users = userMapper.selectUserQuery();
        return users;
    }

    @Override
    public int insertUser(UmsMember umsMember) {
        int insert = userMapper.insert(umsMember);
        return insert;
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

    @Override
    public List<UmsMemberReceiveAddress> getAdressById(String id) {

        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setId(id);
        List<UmsMemberReceiveAddress> select = userAdressMapper.select(umsMemberReceiveAddress);
        return select;
    }


}
