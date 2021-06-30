package com.zmsn;

import com.zmsn.pojo.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
@EnableConfigurationProperties(Dog.class)
@SpringBootApplication
public class FirstHelloWorld {

    public static void main(String[] args) {
        SpringApplication.run(FirstHelloWorld.class, args);
    }
}
