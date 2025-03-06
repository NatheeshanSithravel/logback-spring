package com.logback.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logtest")
public class LogTestController {

    private static final Logger logger = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping
    public String logSomething() {
        logger.info("This is a test log message!");
        return "Log message sent!";
    }
}
