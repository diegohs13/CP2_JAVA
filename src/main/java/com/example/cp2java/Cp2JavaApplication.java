package com.example.cp2java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cp2JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cp2JavaApplication.class, args);
		System.out.println("Spring Boot rodando na porta 8080!");
	}

}
