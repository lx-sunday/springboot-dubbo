package com.mydubbo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo/*.xml")
public class App {

	public static final Logger log=LoggerFactory.getLogger(App.class);
	public static void main(String[] args){
		
		log.info("##consummer app start...");
		SpringApplication.run(App.class, args);
	}
}
