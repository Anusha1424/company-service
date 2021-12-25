package com.anusha.companyservice;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@ComponentScan("com.anusha")
@EntityScan({"com.anusha.core"})
@EnableJpaRepositories(basePackages = {"com.anusha.dao"})
@OpenAPIDefinition(info = @Info(title = "Company APis", version = "1.0", description = "Company Information"))
@EnableEurekaClient
public class CompanyserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyserviceApplication.class, args);
	}
	
	
//	@Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry
//                .addMapping("/**")
//                .allowedOrigins("*","http://localhost:3000");// list all domains
//            }
//        };
//    }
}
