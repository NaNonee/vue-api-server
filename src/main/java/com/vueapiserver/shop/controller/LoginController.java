package com.vueapiserver.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/userList")
    public String getUserList(){
        return "aa";
    }
}
