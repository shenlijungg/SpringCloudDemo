package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo.InstanceStatus;
import com.netflix.discovery.DiscoveryClient;

@RestController
public class RestAction {
	

	    @RequestMapping(value="/hello",method=RequestMethod.GET)
	    public String sayHello(){
	      return "hello restfual";
	    }
}
