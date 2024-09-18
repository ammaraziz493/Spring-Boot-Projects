package com.example.PostgreCRUD;

import com.example.PostgreCRUD.model.Employee;
import com.example.PostgreCRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostgreCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgreCrudApplication.class, args);
	}


}
