package com.zmsn.config;

import com.zmsn.properties.MyRedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
@EnableConfigurationProperties(MyRedisProperties.class)
public class MyRedisAutoConfiguration {


    @Bean
    public Jedis jedis(MyRedisProperties myRedisProperties){
        return new Jedis(myRedisProperties.getHosts(),myRedisProperties.getPort());
    }
}
