package com.example.demo.Cache.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCaching
@EnableFeignClients
public class DemoCacheSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCacheSpringApplication.class, args);
	}

}
