package com.example.StudentAPI.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    public static  void main(String[] args){}
    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(
                        21,
                        LocalDate.of(2003, Month.AUGUST,8),
                        "ammaraziz493@gmail.com",

                        "ammar",
                        1L

                )
        );
}}
