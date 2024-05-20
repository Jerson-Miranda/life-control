package com.evenjoin.readingms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReadingMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadingMsApplication.class, args);
	}

}
