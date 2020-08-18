package org.springcloudtest.example.demo.web;

import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("hello")
public class HelloController{
    private static Logger log = LoggerFactory.getLogger(HelloController.class);
    @Value("${words:'abc'}")
    private String words;
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET,
            produces ="application/json; charset=utf-8")
    public String sayHello(){
//        log.info(words);

        return words;
    }

}
