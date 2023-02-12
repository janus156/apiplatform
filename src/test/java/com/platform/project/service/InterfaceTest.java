package com.platform.project.service;

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
}
