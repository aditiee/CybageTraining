package com.cybage.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(scanBasePackages="com.cybage")
public class EmsApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(EmsApplication.class, args);
	}

}
