package com.packsendme.microservice.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class MicroserviceOauthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOauthServerApplication.class, args);
	}
}
