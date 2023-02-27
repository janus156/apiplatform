package com.platform.project.service;

import com.platform.project.provider.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class InterfaceTest {
    @Resource
    public InterfaceInfoService interfaceInfoService;

    @Test
    void select(){
        interfaceInfoService.getById(2);
    }

    @Resource
    UserInterfaceInfoService userInterfaceInfoService;

    @Resource
    DemoService demoService;


    @Test
    public void Do1(){
        boolean b =demoService.invoke(3,3);
        System.out.println(b);
    }
}
