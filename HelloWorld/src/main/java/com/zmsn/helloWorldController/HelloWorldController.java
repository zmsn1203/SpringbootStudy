package com.zmsn.helloWorldController;

import com.zmsn.pojo.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @Autowired
    private Dog dog;


    @RequestMapping("/hello")
    public @ResponseBody String helloWorld(){
        String name = dog.getName();
        return "My First Application Hello World----"+name;
    }
}
