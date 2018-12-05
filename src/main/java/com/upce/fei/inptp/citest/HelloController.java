package com.upce.fei.inptp.citest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello world from HelloController";
    }
    
    @RequestMapping("/response")
    public String response() {
        Model m = new Model();
        return m.respond("test");
    }
}
