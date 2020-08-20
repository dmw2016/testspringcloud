package com.testspringcloud.ribbon.consumer.controller;

import com.testspringcloud.ribbon.consumer.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ConsumerController {

    private static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    HelloService service;
    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer() throws Exception{

        return service.helloConsumer();
    }

}
