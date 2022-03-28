package com.daniel.wit.util.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {
	
	@RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload String message) {
        System.out.println("Received Message: " + message);
    }
}
