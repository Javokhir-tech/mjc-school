package com.epam.esm.config;

import liquibase.integration.spring.SpringLiquibase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class DbConfig {

    @Value(value = "${datasource.driver}")
    private String datasourceDriver;
    @Value(value = "${datasource.url}")
    private String datasourceUrl;
    @Value(value = "${datasource.username}")
    private String datasourceUsername;
    @Value(value = "${datasource.password}")
    private String datasourcePassword;
    @Value(value = "${datasource.changelog}")
    private String dataSourceChangeLog;

    @Bean
    public DataSource dataSource() {
        var dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(datasourceDriver);
        dataSource.setUrl(datasourceUrl);
        dataSource.setUsername(datasourceUsername);
        dataSource.setPassword(datasourcePassword);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public SpringLiquibase springLiquibase() {
        var liquiBase = new SpringLiquibase();
        liquiBase.setChangeLog(dataSourceChangeLog);
        liquiBase.setDataSource(dataSource());
        return liquiBase;
    }


}
