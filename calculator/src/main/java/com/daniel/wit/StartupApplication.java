package com.daniel.wit;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class StartupApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StartupApplication.class, args);
	}

}
