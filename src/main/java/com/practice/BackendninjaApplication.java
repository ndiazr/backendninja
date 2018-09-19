package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.practice"})
public class BackendninjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendninjaApplication.class, args);
	}
}
