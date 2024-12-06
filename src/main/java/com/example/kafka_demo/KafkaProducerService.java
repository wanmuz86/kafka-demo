package com.example.kafka_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	
	// keyword final means constant
	// static -> It is a class variable
	private static final String TOPIC = "my-topic";
	
	
	// From kafka library, to produce the message
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	public void sendMessage(String message) {
		kafkaTemplate.send(TOPIC, message);
	}

}
