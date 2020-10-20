package com.jjl.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjl.pojo.User;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/test")
    @ResponseBody
    public  String json1() throws JsonProcessingException {
        User user=new User();
        ObjectMapper objectMapper=new ObjectMapper();
        user.setName("ljj");
        user.setAge(20);
        user.setSex("女");
        String s = objectMapper.writeValueAsString(user);
        return  s;
    }
}
