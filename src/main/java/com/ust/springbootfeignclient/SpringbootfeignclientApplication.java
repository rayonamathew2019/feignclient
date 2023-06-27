package com.ust.springbootfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class SpringbootfeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootfeignclientApplication.class, args);
	}

}
