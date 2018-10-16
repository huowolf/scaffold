package com.huowolf.controller;

import com.github.pagehelper.PageInfo;
import com.huowolf.model.UserInfo;
import com.huowolf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by huowolf on 2018/6/22.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String toList(){
        return "user/list";
    }

    @RequestMapping("/list")
    @ResponseBody
    public PageInfo<UserInfo> list(Integer pageNumber,Integer pageSize){
        List<UserInfo> userInfos = userService.findUserInfos(pageNumber, pageSize);
        return new PageInfo<>(userInfos);
    }
}
