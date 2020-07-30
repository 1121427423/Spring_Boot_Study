package com.king.jdbc.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDataSourceConfiguration;
import org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceInitializationMode;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;


import javax.sql.DataSource;
import javax.sql.XADataSource;

/**
 * @author king
 * @Title:
 * @Package
 * @Description:
 * @date 2020/7/3021:29
 */

@Configuration
@ConditionalOnClass({DataSource.class, EmbeddedDatabaseType.class})
@EnableConfigurationProperties(DataSourceProperties.class)
@Import({DataSourcePoolMetadataProvidersConfiguration.class, DataSourceInitializationMode.class})
public class DataSourceAutoConfiguration {

//    @Configuration
//    @Conditional(EmbeddedDatabaseCondition.class)
//    @ConditionalOnMissingBean({DataSource.class, XADataSource.class})
//    @Import(EmbeddedDataSourceConfiguration.class)
//    protected static class EmbeddedDatabaseConfiguration{
//
//    }
}
