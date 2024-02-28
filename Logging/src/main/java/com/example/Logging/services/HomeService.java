package com.example.Logging.services;

import com.example.Logging.controllers.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    Logger logger = LoggerFactory.getLogger(HomeService.class);


    @Value("${myCustomVarTree.num1}")
    int num1;
    @Value("${myCustomVarTree.num2}")
    int num2;


    public Double getResult() {
        try {
            logger.info("starting calculation");
            return Math.pow(num1, num2);
        } finally {
            logger.info("calculation ended");

        }

    }
}
