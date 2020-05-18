package com.hcc.gmalluser.service;

import com.hcc.gmalluser.bean.UmsMember;

import java.util.List;

public interface UserService {
    //通过mapper.xml查询
    List<UmsMember> getUserList();
    //通用mapper
    List<UmsMember> getUserListByMapper();
    //通用mapper
    List<UmsMember> getUserListById(String id);
}
