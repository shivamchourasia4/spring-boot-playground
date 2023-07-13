package com.playground.space.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        String topicName = "space";
        kafkaTemplate.send(topicName, message);
/*
        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName, message);
 future.whenComplete((result, ex) -> {
     if (ex == null) {
         System.out.println("Sent message=[" + message + "] with offset=[" + result.getRecordMetadata().offset() + "]");
     } else {
         System.out.println("Unable to send message=[" + message + "] due to : " + ex.getMessage());
     }
 });

*/
    }

}
