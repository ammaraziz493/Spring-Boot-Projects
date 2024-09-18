package com.example.__MySQL_Connection.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ammar_aziz =new Student(
                    1L,
                    "ammar aziz",
                    "ammaraziz493@gmail.com",

                    LocalDate.of(2003, Month.AUGUST,8),
                    21


            );

            Student ali=new Student(
                    2L,
                    "ali",
                    "ammaraziz493@gmail.com",

                    LocalDate.of(2003, Month.AUGUST,8),
                    20


            );
            repository.saveAll(
                    List.of(ammar_aziz,ali)
            );
        };
    }
}
