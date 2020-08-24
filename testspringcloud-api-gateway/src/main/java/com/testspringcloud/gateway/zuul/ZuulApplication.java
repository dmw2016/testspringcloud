package com.testspringcloud.gateway.zuul;

import com.testspringcloud.gateway.zuul.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper(){
        return new PatternServiceRouteMapper(
                "(?name^.+)-(?version>v.+$)","${version}/${name}"
        );
    }
    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication.class,args);
    }
}
