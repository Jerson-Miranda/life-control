package com.evenjoin.hygienems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HygieneMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HygieneMsApplication.class, args);
	}

}
