package com.example.Logging.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/debug")
    public void debug(){
        logger.debug("This is DEBUG");
    }

    @GetMapping("/info")
    public void info(){
        logger.info("This is INFO");
    }

    @GetMapping("/warning")
    public void warning(){
        logger.warn("this is WARNING");
    }

    @GetMapping("/errors")
    public void errors(){
        logger.error("this is ERROR");
    }





}
