package com.test;

//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
public class Hello {

    private String hello = "hello";

//    @RequestMapping("/hello")
    public String getHello() {
        return hello;
    }
}
