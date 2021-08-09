package com.mt.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wind
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MtOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtOrderApplication.class, args);
	}

}
