package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Teo on 2018/12/19.
 */
@RestController
@RequestMapping("/user")
public class UserCntroller {

    @GetMapping("/user")
    @ResponseBody
    public String getUsers() {
        return "Hello Spring Security";
    }
}
