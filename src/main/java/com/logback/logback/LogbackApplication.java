package com.logback.logback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LogbackApplication {
	private static final Logger logger = LoggerFactory.getLogger(LogbackApplication.class);

	public static void main(String[] args) {
		logger.info("Starting Spring Boot Application...");
		SpringApplication.run(LogbackApplication.class, args);
		logger.info("Application Started Successfully!");
	}
}

@RestController
@RequestMapping("/api")
class LogbackController {
	private static final Logger logger = LoggerFactory.getLogger(LogbackController.class);

	@GetMapping("/hello")
	public String helloWorld() {
		logger.info("HelloWorld endpoint was called!");
		return "Hello, World!";
	}
}




