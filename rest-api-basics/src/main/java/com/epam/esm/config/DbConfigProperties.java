package com.epam.esm.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class DbConfigProperties {

    @Value("${datasource.driver}")
    private String datasourceDriver;
    @Value("${datasource.url}")
    private String datasourceUrl;
    @Value("${datasource.username}")
    private String datasourceUsername;
    @Value("${datasource.password}")
    private String datasourcePassword;

    @Value("${datasource.changelog}")
    private String dataSourceChangeLog;
}
