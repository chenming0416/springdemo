package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenming
 * @create 2020/5/8 17:48
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello,这是release分支的demo!是基于feature分支来的";
    }
}