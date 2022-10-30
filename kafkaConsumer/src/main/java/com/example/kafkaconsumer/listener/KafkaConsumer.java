package com.example.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="kafkaPOC" , groupId = "group_id")
    public void consume(String message) {
        System.out.println("Cosumed msg: "+message);
    }

}
