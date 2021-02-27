package com.longcai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@MapperScan(value = "com.longcai.dao")
@EnableSwagger2
@EnableTransactionManagement 
public class LongcaiBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(LongcaiBasicApplication.class, args);
	}

}
