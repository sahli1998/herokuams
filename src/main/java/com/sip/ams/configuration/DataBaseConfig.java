package com.sip.ams.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.*;


@Configuration
public class DataBaseConfig {
 @Value("${spring.datasource.url}")
 private String dbUrl;
 @Bean
 public DataSource dataSource() {
 HikariConfig config = new HikariConfig();
 	config.setJdbcUrl(dbUrl);
 	return new HikariDataSource(config);
 }
}
