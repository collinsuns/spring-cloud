package com.suns.eurekahighavaiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaHighAvaiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHighAvaiServiceApplication.class, args);
	}
}
