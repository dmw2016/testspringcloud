package org.springcloudtest.example.demo;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient  //较高版本的SpringCloud可以不用服务发现注解，也可以注册。
@SpringBootApplication
public class HelloApplication {


    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
