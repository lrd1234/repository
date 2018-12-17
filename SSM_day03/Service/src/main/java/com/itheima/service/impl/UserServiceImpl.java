package com.itheima.service.impl;


import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /*引入userDao*/
    @Autowired
    private UserDao userDao;

    /*查询到所有的用户*/
   public List<User> findAllUsers(){
      return   userDao.findAllUsers();
    }
}
