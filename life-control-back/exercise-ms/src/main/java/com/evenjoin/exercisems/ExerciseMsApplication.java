package com.evenjoin.exercisems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ExerciseMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseMsApplication.class, args);
	}

}
