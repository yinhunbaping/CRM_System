package com.horizon.crm.setting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/login")
    public String toLogin(){
        //请求转发,SpringMVC中配置了视图解析器前缀/WEB-INF/pages/，所以直接从setting开始写
        return "setting/authority/user/login";
    }
}
