package org.springcloudtest.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("hello")
//@RefreshScope
public class HelloController{

    @Value("${words:'abc'}")
    private String words;

    @RequestMapping(value = "/sayHello",produces ="application/json; charset=utf-8")
    public String sayHello(){
        return words;
    }

}
