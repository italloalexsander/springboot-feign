package com.digitalinnovationone.projectfeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Projectfeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projectfeign2Application.class, args);
	}

}
