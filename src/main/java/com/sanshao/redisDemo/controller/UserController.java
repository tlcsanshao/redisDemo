package com.sanshao.redisDemo.controller;

import com.sanshao.redisDemo.domain.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    @Cacheable(value="user-key",key = "\"abc\"")
    public User getUser() {
        User user=new User("aa","123");
        System.out.println("call this method");
        return user;
    }

    @RequestMapping("/deleteUser")
    @CacheEvict(value="user-key",key = "\"abc\"")
    public void deleteUser(){}

}