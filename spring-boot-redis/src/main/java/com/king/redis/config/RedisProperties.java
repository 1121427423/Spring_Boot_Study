package com.king.redis.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author king
 * @Title:
 * @Package
 * @Description:
 * @date 2020/7/3023:56
 */
@Setter
@Getter
@Component
@ConfigurationProperties("spring.redis")
public class RedisProperties {
    private int database = 0;
    private String url;
    private String host = "127.0.0.1";
    private String password;

}
