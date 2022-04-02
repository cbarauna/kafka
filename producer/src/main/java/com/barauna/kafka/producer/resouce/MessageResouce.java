package com.barauna.kafka.producer.resouce;


import com.barauna.kafka.producer.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@Slf4j
public class MessageResouce {



    @Autowired
    private MessageService service;

    @PostMapping
    public ResponseEntity<String> enviarMenssage(@RequestBody String messagens) {

        log.info("SEND MESSAGE -> {}", messagens);
        service.sendMessage(messagens);
        return ResponseEntity.ok().body(" Messagem enviada com sucesso " + messagens);

    }
}
