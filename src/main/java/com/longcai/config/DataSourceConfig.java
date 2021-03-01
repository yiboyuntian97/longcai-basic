package com.longcai.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

import lombok.extern.slf4j.Slf4j;

/**
 * 数据源配置类
 * @author Administrator
 *
 */
@Slf4j
@Configuration
public class DataSourceConfig {
	
	@Autowired
	private Environment env;
	
	@Primary
	@Bean(name = "primaryDataSource")
	@Qualifier(value = "primaryDataSource")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource() {
		log.info("- - - - -开始配置数据源信息");
		return DruidDataSourceBuilder.create().build();
	}

}
