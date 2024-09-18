package com.example.StudentController.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;
    // Create service layer
    @Autowired //injection of studentService in constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("getAllStudent")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping("addStudent")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "/delete/{student_id}")
    public void deleteStudent(@PathVariable("student_id") Long studentId){
        studentService.deleteStudent(studentId);

    }

    @PutMapping("/update/{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        studentService.updateStudent(studentId,name,email);
    }
}







