package cn.johnyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
    @RequestMapping("/test")
    public String test1(){
        return "success123";
    }
}
