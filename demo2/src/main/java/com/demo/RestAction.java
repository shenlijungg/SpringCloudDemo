package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAction {
	 @RequestMapping("/")
	    String index(){
	        return "Hello Spring Boot";
	    }

}
