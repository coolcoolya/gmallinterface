package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

/**
 * 用户服务
 */
public interface UserService {

    //按照用户id返回收获地址
    public List<UserAddress> getUserAddressList(String userId);
}
