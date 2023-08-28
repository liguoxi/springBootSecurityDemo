package com.example.springbootsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/Mycontroller")
@RestController
public class Mycontroller {
    @GetMapping("/test")
    public Object test() {
        return "空";
    }

    @GetMapping("/admin")
    public Object admin() {
        return "管理员";
    }
}
