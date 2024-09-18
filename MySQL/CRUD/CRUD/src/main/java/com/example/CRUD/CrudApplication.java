package com.example.CRUD;

import com.example.CRUD.model.Employee;
import com.example.CRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// Insert Employee
//		Employee employee = new Employee();
//		employee.setFirstName("Ahtisham");
//		employee.setLastName("Aziz");
//		employee.setEmailId("ammaraziz483@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Jawad");
//		employee1.setLastName("Sikandar");
//		employee1.setEmailId("ammaraziz483@gmail.com");
//		employeeRepository.save(employee1);

	}
}
