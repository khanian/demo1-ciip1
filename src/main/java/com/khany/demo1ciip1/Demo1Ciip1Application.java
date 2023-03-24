package com.khany.demo1ciip1;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Demo1Ciip1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Ciip1Application.class, args);
    }

    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
          kafkaTemplate.send("quickstart-events", "hello-world");
        };
    }
}
