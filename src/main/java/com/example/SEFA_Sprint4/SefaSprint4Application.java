package com.example.SEFA_Sprint4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SefaSprint4Application {

	public static void main(String[] args) {
		SpringApplication.run(SefaSprint4Application.class, args);
	}

}
