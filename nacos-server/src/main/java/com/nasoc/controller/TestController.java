package com.nasoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JOJO
 * @description cehsi
 * @email 1941281071@qq.com
 * @date 2022/4/23 15:23
 */
@RestController
public class TestController {
    @GetMapping
    public String echo() {
        return "Hello Nacos Discovery";
    }
}
