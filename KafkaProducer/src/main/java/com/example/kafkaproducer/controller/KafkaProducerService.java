package com.example.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "kafkaPOC";
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void sendStringMessage(String name) {
        kafkaTemplate.send(TOPIC,name);
    }
}
