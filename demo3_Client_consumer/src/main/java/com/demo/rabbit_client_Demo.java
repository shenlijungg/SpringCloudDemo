package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class rabbit_client_Demo extends SpringBootServletInitializer  {
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
	    return new RestTemplate();
	}
	public static void main(String[] args) {
		 SpringApplication.run(rabbit_client_Demo.class, args);
	}
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        // 设置启动类,用于独立tomcat运行的入口
	        return builder.sources(rabbit_client_Demo.class);
	    }

}
