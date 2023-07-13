package com.playground.space.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/space")
public class SpaceController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public SpaceController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping
    public ResponseEntity<String> getSpace() {
        kafkaTemplate.send("space", "get request on space executed successfully");
        return new ResponseEntity<>("space", HttpStatus.OK);
    }
}
