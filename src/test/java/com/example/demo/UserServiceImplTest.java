package com.example.demo;

import com.example.demo.data.entity.User;
import com.example.demo.service.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceImplTest {

    @Test
    public void Test(){
        User user = new User();
        user.setUserId("532624");
        user.setUserName("im");

        UserServiceImpl userService = new UserServiceImpl(user);
        userService.printUserInfo();
    }
}
