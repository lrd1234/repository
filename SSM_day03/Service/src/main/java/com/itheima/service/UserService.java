package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    /*查询到所有的用户*/
    List<User> findAllUsers();
}
