package com.artservicegateway.artservicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ArtServiceGatewayApplication
 *
 * This is the edge service we use to communicate to the various services through. At the moment
 * it is only responsible for logging.
 */
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ArtServiceGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArtServiceGatewayApplication.class, args);
	}
}
