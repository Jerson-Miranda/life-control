package com.evenjoin.cleaningms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CleaningMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleaningMsApplication.class, args);
	}

}
