package com.example.StudentController.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    public static  void main(String[] args){}
    private final StudentService studentService;
    // Create service layer
    @Autowired //injection of studentService in constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }


}
