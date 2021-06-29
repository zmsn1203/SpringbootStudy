package com.zmsn.helloWorldController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public @ResponseBody String helloWorld(){
        return "My First Application Hello World";
    }
}
