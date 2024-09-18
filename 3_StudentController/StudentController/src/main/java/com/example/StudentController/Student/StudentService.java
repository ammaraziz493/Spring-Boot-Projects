package com.example.StudentController.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        21,
                        LocalDate.of(2003, Month.AUGUST,8),
                        "ammaraziz493@gmail.com",

                        "ammar",
                        1L

                )
        );
    }
}
