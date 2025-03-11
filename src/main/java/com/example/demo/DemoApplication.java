package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}

	public static void main(String[] args) {
		logger.info("Starting Spring Boot application");
		SpringApplication.run(DemoApplication.class, args);
		logger.info("Spring Boot application started successfully");
	}
}