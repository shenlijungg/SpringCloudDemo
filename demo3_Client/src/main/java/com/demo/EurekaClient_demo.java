package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/*使用注解开启自动装配，使服务能够向注册中心注册、
向注册中心服务租约
（实际上就是定时器持续发送心跳告诉服务注册中心自己还活着）、
取消租约、查询服务列表等，这个注解是@EnableDiscoveryClient
*/
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClient_demo {
	
	public static void main(String[] args) {
		 SpringApplication.run(EurekaClient_demo.class, args);
	}

}
