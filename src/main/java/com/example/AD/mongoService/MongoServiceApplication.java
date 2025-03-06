package com.example.AD.mongoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MongoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoServiceApplication.class, args);
	}

	//TODO: vamos a la segunda entidad
}
