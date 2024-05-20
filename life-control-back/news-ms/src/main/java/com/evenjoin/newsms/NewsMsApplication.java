package com.evenjoin.newsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NewsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsMsApplication.class, args);
	}

}
