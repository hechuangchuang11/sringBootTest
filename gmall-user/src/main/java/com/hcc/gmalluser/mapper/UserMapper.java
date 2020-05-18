package com.hcc.gmalluser.mapper;

import com.hcc.gmalluser.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper  {
     List<User> selectUserQuery();
}
