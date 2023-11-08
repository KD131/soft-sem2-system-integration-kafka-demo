package com.example.producer.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class ProducerController {
    private final ProducerService producerService;
    private final Logger logger = LoggerFactory.getLogger(ProducerController.class);

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping(path = "message", consumes = "text/plain")
    public void sendMessage(@RequestBody String message) {
        logger.info("Message received: " + message);
        producerService.sendMessage(message);
    }
}
