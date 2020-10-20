package com.jjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//自动就给装配了
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public  String aaa(Model model){
        //封装数据
        model.addAttribute("msg","helloannoSpringmvc");
        //返回域名
        return "hello";
    }
}
