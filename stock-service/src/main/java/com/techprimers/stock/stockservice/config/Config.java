package com.techprimers.stock.stockservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
//@ConfigurationProperties(path="classpath:/application.yml", name="db")
public class Config {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
