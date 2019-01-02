package com.splunk.boot.service.careers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController{
    
    @Autowired
    private Environment environment;


    @GetMapping("/sample/hello/{input}")
    public String retrieveHello(@PathVariable String input){
        String test = "Hello Service"+input;
        return test;
    }
}


