package com.example.demo.controller;

import com.example.demo.data.entity.User;
import com.example.demo.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }

    @RequestMapping(value = "info/get", method = RequestMethod.GET)
    @ResponseBody
    public Object getUserInfo(){
        User user = new User();
        user.setUserId("532624199309271512");
        user.setUserName("im");
        this.userService.setUser(user);
        return this.userService.getUser();
    }
}
