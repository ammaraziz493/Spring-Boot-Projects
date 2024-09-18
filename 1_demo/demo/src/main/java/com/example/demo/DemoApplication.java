package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController // RestController first step
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping // 2 step
//	public String hello(){
//		return "Hello World";}
	// 3 step - > change the function to a list
//	public  List<String> hello(){ // it will give us the jason back
//		return List.of("Hello", "World");

	// 4 step -> after creating the student class
	public  List<Student> hello(){
		return List.of(
			new Student(
					21,
					1L,
					"ammar aziz",
					"ammaraziz493@gmail.com",
					LocalDate.of(2003, Month.AUGUST,30)




			)
		);

	}

}
