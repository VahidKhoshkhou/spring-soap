package com.cloud.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSoapClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSoapClient1Application.class, args);
	}
	

}
