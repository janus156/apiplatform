package com.platform.project.controller;

import clientsdk.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/name")
public class TimeController {

    @PostMapping("/user")
    public String getNameByPostRestful(@RequestBody User user, HttpServletRequest request){
        return user+":"+LocalDateTime.now().toString();
    }

}
