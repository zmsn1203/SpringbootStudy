package com.zmsn.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.redis")
public class MyRedisProperties {

    //主机地址
    private String hosts = "127.0.0.1";
    //端口号
    private Integer port = 6379;

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
