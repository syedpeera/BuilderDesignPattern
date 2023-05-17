package com.builder.BuilderDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderDesignPatternApplication.class, args);
		Customer customer = new CustomerBuilder().firstName("Sam").lastName("Stark").primaryEmail("samStark@gmail.com").build();
		System.out.println("Customer Details: "+customer.toString());
	}
}