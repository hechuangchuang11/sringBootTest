package com.hcc.gmalluser.controller;

import com.hcc.gmalluser.bean.UmsMember;
import com.hcc.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUserList")
    @ResponseBody
    public  List<UmsMember> getUserQuery(){
       List<UmsMember> users = userService.getUserList();
        return users;
    }

    @RequestMapping("getUserQueryByMapper")
    @ResponseBody
    public  List<UmsMember> getUserQueryByMapper(){
        List<UmsMember> umsMembers = userService.getUserListByMapper();
        return umsMembers;
    }

    @RequestMapping("getUserQueryById")
    @ResponseBody
    public  List<UmsMember> getUserQueryById(String id){
        List<UmsMember> umsMembers = userService.getUserListById(id);
        return umsMembers;
    }


}
