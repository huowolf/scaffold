package com.huowolf.service;

import com.huowolf.model.UserInfo;

import java.util.List;

/**
 * Created by huowolf on 2018/6/22.
 */
public interface UserService {

    public List<UserInfo> findUserInfos(Integer pageNum,Integer pageSize);
}
