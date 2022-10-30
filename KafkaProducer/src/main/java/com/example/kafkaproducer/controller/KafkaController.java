package com.example.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @PostMapping("/publish/{name}")
    public ResponseEntity<String> publishMessage(@PathVariable(name = "name") String name){
        kafkaProducerService.sendStringMessage(name);
        return new ResponseEntity<>("Published Message Successfully", HttpStatus.OK);
    }


}
