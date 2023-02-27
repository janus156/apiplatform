package com.platform.project.service;

import clientsdk.client.PlatClient;

import clientsdk.model.User;
import com.platform.project.controller.MailController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class client {
    @Resource
    PlatClient platClient;

    @Resource
    MailController mailController;

    @Test
    void getInter(){
        User user = new User();
        user.setUsername("abc");
        String usernameByPost = platClient.getUsernameByPost(user);
    }

    @Test
    void sendMail(){
        mailController.sendTextMailMessage("3527813190@qq.com","nihao","nihao");
    }

}
