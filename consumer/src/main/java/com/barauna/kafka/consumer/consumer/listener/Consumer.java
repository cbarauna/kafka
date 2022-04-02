package com.barauna.kafka.consumer.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = "kafka_topics", groupId = "group_id")
    public void consumer(String message) {
        log.info(String.format(" ### -> Consumer Message -> %s", message));
    }
}
