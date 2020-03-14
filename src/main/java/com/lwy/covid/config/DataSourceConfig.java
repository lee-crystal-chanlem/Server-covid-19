package com.lwy.covid.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author : lwy-mbp
 * create at:  2020-03-14  11:28
 * @description:
 */
@SpringBootConfiguration
public class DataSourceConfig {
    @Bean(name="datasource")
    @Qualifier(value = "datasource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.c3p0")
    public DataSource dataSource(){
        return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
    }
}
