package com.example.Logging.controllers;

import com.example.Logging.services.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    HomeService homeService;


    @GetMapping("/")
    public String greeting() {
        logger.info("Starting greetings");
        return "Welcome everybody";
    }

    @GetMapping("/exp")
    public Double exp() {
        return homeService.getResult();
    }

    @GetMapping("/get-errors")
    public void getErrors() {
        Error error = new Error("this is a new error!");
        logger.error("this is error logging" + error);
    }

}
