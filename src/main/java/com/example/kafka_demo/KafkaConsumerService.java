package com.example.kafka_demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

// It will created once the application is created
@Service
public class KafkaConsumerService {
	
	@KafkaListener(topics = "my-topic", groupId="my-group")
	public void consume(String message) {
		System.out.println("Message from the listener");
		System.out.println("Received message: "+message);
	}

}
