package com.hcc.gmall.service;

//import com.hcc.gmalluser.bean.UmsMember;
//import com.hcc.gmalluser.bean.UmsMemberReceiveAddress;

import com.hcc.gmall.bean.UmsMember;
import com.hcc.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    //通过mapper.xml查询
    List<UmsMember> getUserList();
    //添加用户数据
    int insertUser(UmsMember umsMember);
    //通用mapper
    List<UmsMember> getUserListByMapper();
    //通用mapper
    List<UmsMember> getUserListById(String id);
    //通用mapper
    List<UmsMemberReceiveAddress> getAdressById(String id);
}
