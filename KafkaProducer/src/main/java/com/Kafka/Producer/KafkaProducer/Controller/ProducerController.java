package com.Kafka.Producer.KafkaProducer.Controller;


import com.Kafka.Producer.KafkaProducer.Model.User;
import com.Kafka.Producer.KafkaProducer.Service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    ProducerService service;

    @PostMapping("/json")
    public ResponseEntity<String>publishJsonMessage(@RequestBody User user){
        service.sendJsonMessage(user);
        return new ResponseEntity<String>("Published Json Message Successfully .", HttpStatus.OK);
    }

    @PostMapping("/string/{name}")
    public ResponseEntity<String>publishStringMessage(@PathVariable("name") String name){
        service.sendStringMessage(name);
        return new ResponseEntity<String>("Published String Message Successfully .", HttpStatus.OK);
    }

}
