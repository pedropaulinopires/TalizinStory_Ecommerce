package com.talizinstory.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TalizinStoryEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalizinStoryEcommerceApplication.class, args);
	}

}
