package com.devguy.shematoclassdefintion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
@SpringBootApplication
@RestController
public class ShemaToClassdefintionApplication {

    Messages messages = new Messages();
    private static Logger LOGGER = LoggerFactory.getLogger(ShemaToClassdefintionApplication.class);
    final static ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

    @GetMapping("/message")
    public String getMessage() {
        LOGGER.info("Fetching message...");
        return "Schema to Pojo is Running";
    }

    @GetMapping("/files")
    public String getFiles() throws JsonProcessingException {
        LOGGER.info("Fetching files...");
        return ow.writeValueAsString(messages.getFiles());
    }

    @GetMapping("/compositions")
    public String getCompositions() throws JsonProcessingException {
        LOGGER.info("Fetching compositions...");
        return ow.writeValueAsString(messages.getAllCompositions());
    }

    public static void main(String[] args) {
        SpringApplication.run(ShemaToClassdefintionApplication.class, args);
    }

}
