package com.example.demo.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.sql.Connection;

@ComponentScan
@Configuration
public class DruidDataSourceConfig {

    @Autowired
    private Environment env;
    private DruidDataSource dataSource;

    @Bean
    public javax.sql.DataSource getDataSource() {
        dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        return dataSource;
    }

    @Bean
    public Connection getConnection(){
        Connection connection = null;
        try{
            connection = dataSource.getConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}