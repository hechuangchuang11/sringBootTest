package com.hcc.gmalluser.mapper;




import com.hcc.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<UmsMember> {
     List<UmsMember> selectUserQuery();
}
