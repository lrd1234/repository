package com.itheima.web.controller;


import com.itheima.domain.Account;
import com.itheima.domain.User;
import com.itheima.service.AccountService;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    /*注册service*/
    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAllUsers.do")
    public String findAllUsers(Model model){
        List<User> users = userService.findAllUsers();
        model.addAttribute("users",users);
        return "success";
    }

    @RequestMapping("/account.do")
    public String findAllAccount(){
        List<Account> all = accountService.findAll();
        System.out.println(all);
        return "success";
    }

}
