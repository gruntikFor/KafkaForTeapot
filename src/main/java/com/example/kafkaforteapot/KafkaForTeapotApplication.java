package com.example.kafkaforteapot;

import com.example.kafkaforteapot.dto.CatDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaForTeapotApplication {

//    @KafkaListener(topics = "msg")
//    public void msgListener(String msg){
//        System.out.println(msg);
//    }

    @KafkaListener(topics = "msg")
    public void orderListener(ConsumerRecord<String, CatDto> record){
        System.out.println(record.partition());
        System.out.println(record.key());
        System.out.println(record.value());
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaForTeapotApplication.class, args);
    }

}
