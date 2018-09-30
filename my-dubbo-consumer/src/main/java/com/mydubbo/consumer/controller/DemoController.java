package com.mydubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydubbo.api.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService service;

	@RequestMapping(value="/demo/{name}",method=RequestMethod.GET)
	public String sayHello(@PathVariable("name") String name){
		
       return service.sayHello(name);
	}
}
