package com.example.MySQL.connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySqlConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlConnectionApplication.class, args);
	}
	@GetMapping
	public String hello(){
		return "Hello World";
	}

}
