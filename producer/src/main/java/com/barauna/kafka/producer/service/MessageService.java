package com.barauna.kafka.producer.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageService {

   // @Value("${topic.kafka-topic")
    private String topic = "kafka_topics";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(String message) {
        log.info("Message - > {}", message);
        this.kafkaTemplate.send(topic, message);
    }
}
