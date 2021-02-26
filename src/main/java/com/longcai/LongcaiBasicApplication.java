package com.longcai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@MapperScan(value = "com.longcai.dao")
public class LongcaiBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(LongcaiBasicApplication.class, args);
	}

}
