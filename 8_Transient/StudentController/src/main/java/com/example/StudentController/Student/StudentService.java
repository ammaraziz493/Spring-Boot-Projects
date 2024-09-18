package com.example.StudentController.Student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
       Optional<Student> studentByEmail =  studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        studentRepository.findById(studentId);
//        studentRepository.existsById(studentId);
        studentRepository.deleteById(studentId);

    }
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
         Student student = studentRepository.findById(studentId).orElseThrow(()-> new IllegalStateException(
                 "student with id" + studentId + "does not extist"
         ));
         student.setName(name);
         student.setEmail(email);
    }


}
