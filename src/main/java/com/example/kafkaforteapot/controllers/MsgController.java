package com.example.kafkaforteapot.controllers;

import com.example.kafkaforteapot.dto.CatDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("msg")
public class MsgController {

    @Autowired
    private KafkaTemplate<String, CatDto> kafkaTemplate;

    @PostMapping
    public void sendOrder(String msgId, CatDto msg) {
        msg.setName("Sema");
        msg.setAge(12);
        msg.setOwner("Igor");
        ListenableFuture<SendResult<String, CatDto>> future = kafkaTemplate.send("msg", msgId, msg);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }
}
