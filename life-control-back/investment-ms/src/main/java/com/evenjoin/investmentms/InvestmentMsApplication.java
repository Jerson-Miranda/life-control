package com.evenjoin.investmentms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class InvestmentMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentMsApplication.class, args);
	}

}
