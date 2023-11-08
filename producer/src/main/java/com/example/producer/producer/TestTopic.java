package com.example.producer.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestTopic {

    @Bean
    public NewTopic test() {
        return new NewTopic("test", 1, (short) 1);
    }
}
