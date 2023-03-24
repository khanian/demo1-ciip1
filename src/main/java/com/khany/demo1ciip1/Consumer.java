package com.khany.demo1ciip1;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(id = "khany-kafka-id", topics = "quickstart-events")
    public void listen(String message) {
        System.out.println("===============");
        System.out.println(message);
        System.out.println("===============");
    }
}
