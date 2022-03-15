package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class NetworkConnectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NetworkConnectionApplication.class, args);
		Home home = context.getBean(Home.class);
		home.connect();
	}

}
