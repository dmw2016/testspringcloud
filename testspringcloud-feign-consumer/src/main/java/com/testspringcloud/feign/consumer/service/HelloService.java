package com.testspringcloud.feign.consumer.service;


import com.testspringcloud.feign.consumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("testspringcloud-web")
public interface HelloService {
    @RequestMapping(value = "/hello/sayHello")
    String hello();

    @RequestMapping(value = "/hello/sayHello1",method = RequestMethod.GET)
    String hello(@RequestParam String name);

    @RequestMapping(value = "/hello/sayHello2",method = RequestMethod.GET)
    String hello(@RequestHeader String name, @RequestHeader Integer age);

    @RequestMapping(value = "/hello/sayHello3",method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
