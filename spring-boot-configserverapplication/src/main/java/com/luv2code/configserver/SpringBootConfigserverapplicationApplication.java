package com.luv2code.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.retry.annotation.Retryable;

@SpringBootApplication
@EnableConfigServer
@Retryable
public class SpringBootConfigserverapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigserverapplicationApplication.class, args);
	}

}
