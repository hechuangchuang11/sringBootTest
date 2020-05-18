package com.hcc.gmalluser.service;

import com.hcc.gmalluser.bean.User;

import java.util.List;

public interface UserService {
    //通过mapper.xml查询
    List<User> getUserList();

}
