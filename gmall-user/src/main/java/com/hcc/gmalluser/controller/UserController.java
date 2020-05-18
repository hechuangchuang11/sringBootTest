package com.hcc.gmalluser.controller;

import com.hcc.gmalluser.bean.User;
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
    public  List<User> getUserQuery(){
       List<User> users = userService.getUserList();
        return users;
    }


}
