package com.dtv.middle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@PropertySource("classpath:swagger.properties")
@Configuration
public class SwaggerConfig {

	 private static final String SWAGGER_API_VERSION = "2.0";
	    private static final String LICENSE_TEXT = "License";
	    private static final String TITLE = "ICTA Pilot";
	    private static final String DESCRIPTION = "ICTA Pilot API";

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title(TITLE)
	                .description(DESCRIPTION)
	                .license(LICENSE_TEXT)
	                .version(SWAGGER_API_VERSION)
	                .build();
	    }

	    @Bean
	    public Docket productsApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                .pathMapping("/")
	                .select()
	                .paths(PathSelectors.any())
	                .build();
	    }
}
