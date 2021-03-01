package com.longcai.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置类
 * @author Administrator
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	// 配置swagger的Docket bean实例
	@Bean
	public Docket docket(Environment environment) {
		
		//获取项目环境
		Profiles profiles = Profiles.of("dev","test");
		boolean envFlag = environment.acceptsProfiles(profiles);
		
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).enable(envFlag)
				//.groupName(null) 分组需配置多个docket实例
				.select().apis(RequestHandlerSelectors
				//指定扫描接口的包
				.basePackage("com.longcai.controller"))
				//.paths(null)接口过滤
				.build();
	}
	
	//配置swagger信息apiInfo
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		Contact contact = new Contact("", "", "");
		return new ApiInfo("swagger Api", "author:longcai", "v1.0", "/",contact , "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",new ArrayList<VendorExtension>());
		
	}

}
