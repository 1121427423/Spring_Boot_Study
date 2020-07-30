package com.king.druid;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author king
 * @Title:
 * @Package
 * @Description:
 * @date 2020/7/3022:09
 */

@Setter
@Getter
@Component
@ConfigurationProperties("spring.datasource.druid")
public class DruidDataSourceProperties {
    private String username;
    private String password;
    private String url;
    private String driverClassName;
    private Integer initialSize;
    private Integer maxActive;
    private Integer minIdle;
    private long maxWait;
    private boolean poolPreparedStatements;
    public String filters;
}
