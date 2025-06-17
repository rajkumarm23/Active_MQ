package com.verinon.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "SpringBoot.Queue")
	public void consumer(String message) {
		System.out.println("Received Message " + message);
	}

}
