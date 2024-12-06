package com.example.kafka_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	
	// localhost:8080/send?message=This is an example of a topic
	@GetMapping("/send")
	public String sendMessage(@RequestParam("message") String message) {
		kafkaProducerService.sendMessage(message);
		return "Message sent to Kafka topics";
	}
}
