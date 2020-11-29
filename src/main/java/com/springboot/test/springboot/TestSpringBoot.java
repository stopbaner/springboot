package com.springboot.test.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @描述
 * @创建人 szp
 * @修改人和其它信息
 */
@RestController
//@SpringBootApplication
@EnableAutoConfiguration
public class TestSpringBoot {
    @RequestMapping("/hello")
    public String sendString(){
        return "hel;    loworld";
    }
}
