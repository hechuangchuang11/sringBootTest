package com.hcc.gmalluser.controller;

import com.hcc.gmall.bean.UmsMember;
import com.hcc.gmall.bean.UmsMemberReceiveAddress;
import com.hcc.gmall.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("getUserList")
    @ResponseBody
    public  List<UmsMember> getUserQuery(){
        //通过mybatis查询用户信息
       List<UmsMember> users = userService.getUserList();
        return users;
    }
    //查询用户信息
    @RequestMapping("getUserQueryByMapper")
    @ResponseBody
    public  List<UmsMember> getUserQueryByMapper(){
        List<UmsMember> umsMembers = userService.getUserListByMapper();
        return umsMembers;
    }
    //添加用户信息
    @RequestMapping(value = "insetUser" , method = RequestMethod.GET)
    @ResponseBody
    public UmsMember insertUser(@Valid  UmsMember umsMember){
        long start = System.currentTimeMillis();
        try {
            int i = userService.insertUser(umsMember);
            long end = System.currentTimeMillis();
            logger.info("插入耗时：{}s",(end - start));
            return umsMember;
        } catch (Exception e) {
            logger.error("插入失败");
            e.printStackTrace();
            return null;
        }

    }
    @RequestMapping("getUserQueryById")
    @ResponseBody
    public  List<UmsMember> getUserQueryById(String id){
        List<UmsMember> umsMembers = userService.getUserListById(id);
        return umsMembers;
    }

    @RequestMapping("getAdressById")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAdressById(String  id){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getAdressById(id);
        return umsMemberReceiveAddresses;
    }


}
