package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {

    /*查询到所有的用户*/
    List<User> findAllUsers();
}
