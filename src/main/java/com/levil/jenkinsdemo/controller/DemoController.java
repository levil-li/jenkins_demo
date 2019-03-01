package com.levil.jenkinsdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "demo")
@RestController
public class DemoController {

    @RequestMapping("test")
    public Object test(){
        return "demo is ok";
    }

}
