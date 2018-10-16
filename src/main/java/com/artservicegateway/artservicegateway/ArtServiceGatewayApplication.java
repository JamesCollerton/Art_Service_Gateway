package com.artservicegateway.artservicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ArtServiceGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArtServiceGatewayApplication.class, args);
	}
}
