package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.expression.Maps;

import java.util.Map;

@Controller
public class HelloController {

//    @RequestMapping({"/","login.html"})
//    public String login(){
//        return "Login";
//    }


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

//    @RequestMapping("/success")
//    public String success(Model model){
//        //classpath:/templates/success.html
//        //map.put("hello","快出来");
//        model.addAttribute("hello","粗来");
//        return "success";
//    }
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","原来是@RestController的问题");
        return "success";
    }
}
