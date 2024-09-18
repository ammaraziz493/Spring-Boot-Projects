package com.example.StudentController.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Autowired
    private final StudentRepository studentRepository;

    public StudentConfig(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            Student Ammar = new Student(

                    LocalDate.of(2003, Month.AUGUST, 8),
                    "ammaraziz493@gmail.com",

                    "ammar",
                    1L

            );

            Student Ali= new Student(

                    LocalDate.of(2004, Month.AUGUST, 8),
                    "ali@gmail.com",

                    "ali",
                    2L


            );
                studentRepository.saveAll(
                        List.of(Ammar,Ali)
                );
        };
    }
}
