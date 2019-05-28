package com.taoj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hi")
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello---World--Haidi";
    }

    @RequestMapping("/say")
    public String openJsp(){
        return "say";
    }
}
