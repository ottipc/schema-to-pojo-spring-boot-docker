package com.devguy.shematoclassdefintion;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
@SpringBootApplication
@RestController
public class ShemaToClassdefintionApplication {


    private static Logger LOGGER = LoggerFactory.getLogger(ShemaToClassdefintionApplication.class);

    @GetMapping("/message")
    public String getMessage() {
        LOGGER.info("Fetching message...");
        return "Schema to Pojo is Running";
    }


    public static void main(String[] args) {
        SpringApplication.run(ShemaToClassdefintionApplication.class, args);
    }

}
