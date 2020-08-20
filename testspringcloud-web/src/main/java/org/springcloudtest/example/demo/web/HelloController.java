package org.springcloudtest.example.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springcloudtest.example.demo.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@RestController
@RequestMapping("hello")
public class HelloController{
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Value("${words:'abc'}")
    private String words;

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET,
            produces ="application/json; charset=utf-8")
    public String sayHello() throws Exception{
//        int sleepTime = new Random().nextInt(3000);
//        logger.info("sayHello  sleepTime: " + sleepTime);
//        Thread.sleep(sleepTime);
        return words;
    }

    @RequestMapping(value = "/sayHello1",method = RequestMethod.GET,
            produces ="application/json; charset=utf-8")
    public String sayHello(@RequestParam String name) throws Exception{
//        int sleepTime = new Random().nextInt(3000);
//        logger.info("sayHello1  sleepTime: " + sleepTime);
//        Thread.sleep(sleepTime);
        return "Hello "+ name;
    }

    @RequestMapping(value = "/sayHello2",method = RequestMethod.GET,
            produces ="application/json; charset=utf-8")
    public User sayHello(@RequestHeader String name, @RequestHeader Integer age) throws Exception{
//        int sleepTime = new Random().nextInt(3000);
//        logger.info("sayHello2  sleepTime: " + sleepTime);
//        Thread.sleep(sleepTime);
        return new User(name,age);
    }

    @RequestMapping(value = "/sayHello3",method = RequestMethod.POST,
            produces ="application/json; charset=utf-8")
    public String sayHello(@RequestBody User user) throws Exception{
//        int sleepTime = new Random().nextInt(3000);
//        logger.info("sayHello3  sleepTime: " + sleepTime);
//        Thread.sleep(sleepTime);
        return "Hello "+user.getName()+", "+user.getAge();
    }

}
