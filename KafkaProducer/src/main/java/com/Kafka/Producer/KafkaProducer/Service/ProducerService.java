package com.Kafka.Producer.KafkaProducer.Service;

import com.Kafka.Producer.KafkaProducer.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    KafkaTemplate<String, User>jsonTemplate;

    private static final String JSONTopic="jsonPOC";
    public void sendStringMessage(String name){
        generalTemplate.send(generalTopic,name);
    }

    @Autowired
    KafkaTemplate<String,String> generalTemplate;

    private static final String generalTopic="generalPOC";


    public void sendJsonMessage(User user){
        jsonTemplate.send(JSONTopic,user);
    }
}
