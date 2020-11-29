package com.example.demo.data.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Setter
@Getter
public class User {
    private String userId;
    private String userName;
}
