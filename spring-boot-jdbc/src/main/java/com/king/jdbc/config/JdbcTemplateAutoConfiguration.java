package com.king.jdbc.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author king
 * @Title:
 * @Package
 * @Description:
 * @date 2020/7/3021:43
 */


public class JdbcTemplateAutoConfiguration {

//    @Bean
//    @Primary
//    @ConditionalOnMissingBean(JdbcOperations.class)
//    public JdbcTemplate jdbcTemplate(){
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(this.dataSource);
//        JdbcProperties.Template template = this.properties.getTemplate();
//        jdbcTemplate.setFetchSize(template.getFetchSize());
//        jdbcTemplate.setMaxRows(template.getMaxRows());
//        if(template.getQueryTimeout() !=null){
//            jdbcTemplate.setQueryTimeout((int) template.getQueryTimeout().getSeconds());
//        }
//        return jdbcTemplate;
//    }

}
