package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    static class TestController {
        
        private static final Logger logger = LoggerFactory.getLogger(TestController.class);
        
        @GetMapping("/")
        public String home() {
            logger.debug("Debug log message from Spring Boot app");
            logger.info("Info log message from Spring Boot app");
            logger.warn("Warning log message from Spring Boot app");
            return "Spring Boot 3.4.3 app running successfully on WildFly 30 with Java 21!";
        }
    }
}
