package com.jjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AjaxController {
    @RequestMapping("/a3")
    @ResponseBody
    public String ajax3(String name, String pwd) {
        String msg = "";
        //模拟数据库中存在数据
        if (name != null) {
            if ("admin".equals(name)) {
                msg = "OK";
            } else {
                msg = "用户名输入错误";
            }
        }
        if (pwd != null) {
            if ("123456".equals(pwd)) {
                msg = "OK";
            } else {
                msg = "密码输入有误";
            }
        }
        return msg; //由于@RestController注解，将msg转成json格式返回
    }
}

