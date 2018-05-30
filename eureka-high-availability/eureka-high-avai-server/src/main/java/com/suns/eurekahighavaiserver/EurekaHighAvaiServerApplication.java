package com.suns.eurekahighavaiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaHighAvaiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHighAvaiServerApplication.class, args);
	}
}
