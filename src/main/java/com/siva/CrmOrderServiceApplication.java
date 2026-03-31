package com.siva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CrmOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmOrderServiceApplication.class, args);
	}

}
