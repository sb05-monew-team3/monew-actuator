package com.monew.monew_actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MonewActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonewActuatorApplication.class, args);
		System.out.println("localhost:9090");
	}
}
