package com.zmsn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class AutoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AutoApplication.class, args);
        Jedis jedis = context.getBean("jedis", Jedis.class);
        jedis.set("wang","long");
        System.out.println(jedis.get("wang"));
        context.close();
    }
}
