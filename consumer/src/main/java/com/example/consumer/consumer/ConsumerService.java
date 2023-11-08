package com.example.consumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "test", groupId = "test-group")
    public void consume(String message) {
        logger.info("Consumed message: " + message);
    }
}
