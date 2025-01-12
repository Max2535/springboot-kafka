package com.max.springbootkafkatutorial.controller;

import com.max.springbootkafkatutorial.kafka.JsonKafkaProducer;
import com.max.springbootkafkatutorial.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    @Autowired
    private JsonKafkaProducer kafkaProducer;

    // http://localhost:8080/api/v1/kafka/publish
    @PostMapping(value = "/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Message sent to the Kafka Topic successfully");
    }
}
