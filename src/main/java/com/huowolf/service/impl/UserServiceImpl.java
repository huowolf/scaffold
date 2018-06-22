package com.huowolf.service.impl;

import com.github.pagehelper.PageHelper;
import com.huowolf.mapper.UserInfoMapper;
import com.huowolf.model.UserInfo;
import com.huowolf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huowolf on 2018/6/23.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findUserInfos(Integer pageNum, Integer pageSize) {
        if(pageNum!= null && pageSize != null){
            PageHelper.startPage(pageNum,pageSize);
        }
        return userInfoMapper.selectAll();
    }
}
