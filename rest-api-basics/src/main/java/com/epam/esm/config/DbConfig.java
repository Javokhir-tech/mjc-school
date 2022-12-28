package com.epam.esm.config;

import liquibase.integration.spring.SpringLiquibase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class DbConfig {

    private final DbConfigProperties dbProperties;
    @Bean
    public DataSource dataSource() {
        var dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dbProperties.getDatasourceDriver());
        dataSource.setUrl(dbProperties.getDatasourceUrl());
        dataSource.setUsername(dbProperties.getDatasourceUsername());
        dataSource.setPassword(dbProperties.getDatasourcePassword());
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public SpringLiquibase springLiquibase() {
        var liquiBase = new SpringLiquibase();
        liquiBase.setChangeLog(dbProperties.getDataSourceChangeLog());
        liquiBase.setDataSource(dataSource());
        return liquiBase;
    }

}
