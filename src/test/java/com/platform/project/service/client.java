package com.platform.project.service;

import clientsdk.client.PlatClient;

import clientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class client {
    @Resource
    PlatClient platClient;

    @Test
    void getInter(){
        User user = new User();
        user.setUsername("abc");
        String usernameByPost = platClient.getUsernameByPost(user);
    }
}
