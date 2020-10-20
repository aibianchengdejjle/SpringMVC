package com.jjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest {
    @RequestMapping("/t")
    public  String test(@RequestParam("username") String name){
        System.out.println(name);
        return "hello";
    }

}
