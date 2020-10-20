package com.jjl.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView 模型视图
        ModelAndView mv=new ModelAndView();
        //封装对象 ，放在modelandview中，
        mv.addObject("msg","hellospringmvc");
        //封装要跳转的视图，放在modeandview中
        mv.setViewName("hello");///WEB-INF/jsp/hello.jsp
        return mv;
    }
}
