package com.verinon.producer.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@Autowired
	JmsTemplate jmsTemplate;
	@Autowired
	public Queue queue;

	@GetMapping("/producer/{message}")
	public String publish(@PathVariable("message") String message) {
		jmsTemplate.convertAndSend(queue, message);

		return "Published successfully";

	}

}
