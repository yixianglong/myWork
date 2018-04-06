package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@Value("${first}")
private String first;
    @RequestMapping(value = "/",method =RequestMethod.GET)
    public String index() {
        return  first +" from Spring Boot!";
    }

}
