package com.jjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodeingTest {
    //过滤器解决乱码
    @PostMapping("/e/encoding")
    public  String test(String name,Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "hello";
    }
}
