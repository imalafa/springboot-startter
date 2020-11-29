package com.example.demo.service.serviceImpl;

import com.example.demo.data.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private User user;

    @Autowired
    public UserServiceImpl(User user){
        this.user = user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser(){
        return this.user;
    }

    @Override
    public String getUserId() {
        return this.user.getUserId();
    }

    @Override
    public String getUserName() {
        return this.user.getUserName();
    }

    @Override
    public void printUserInfo() {
        System.out.println("userId: " + this.getUserId() + ", userName: " + this.getUserName());
    }
}
