package com.playground.space;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;


@SpringBootApplication
public class SpaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpaceApplication.class, args);


/*
        ApplicationContext context = new AnnotationConfigApplicationContext(SpaceApplication.class);

        Producer producer = context.getBean(Producer.class);
        producer.sendMessage("First Message to Kafka.");
*/

    }

//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
//        return args -> {
//            kafkaTemplate.send("space","through clr");
//        };
//    }

}
