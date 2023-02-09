package com.platform.project.controller;

import clientsdk.model.User;
import clientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/")
    public String getNameByGet(String name){
        return "Get方法，名字："+name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam(value = "name") String name){
        return "Post方法，名字："+name;
    }

    @PostMapping("/user")
    public String getNameByPostRestful(@RequestBody User user, HttpServletRequest request){
        String accessKey = request.getHeader("accessKey");
//        if (!accessKey.equals("admin")){
//            throw new RuntimeException("无访问权限！");
//        }
//
//        String sign = request.getHeader("sign");
//        String body=request.getHeader("body");
//
//        String serverSign = SignUtils.genSign(body, "admin");
//        if (!sign.equals(serverSign)){
//            throw new RuntimeException("签名错误！");
//        }
        return "Post方法，名字："+user.getUsername();
    }

}
