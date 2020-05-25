package com.project.Assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/Hello")
    public String sayHello(){
        return "Hello world";
    }
}
