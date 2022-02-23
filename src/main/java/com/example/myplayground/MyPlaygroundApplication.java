package com.example.myplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class MyPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPlaygroundApplication.class, args);
		System.out.println("visit http://127.0.0.1:8080/ in your browser");
	}

}
