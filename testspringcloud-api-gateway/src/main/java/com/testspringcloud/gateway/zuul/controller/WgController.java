package com.testspringcloud.gateway.zuul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;

@RestController
//@RequestMapping(value = "wg")
public class WgController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/getMsg",method = RequestMethod.GET)
    public String getMsg() throws Exception{
        return "wg";
    }
}
