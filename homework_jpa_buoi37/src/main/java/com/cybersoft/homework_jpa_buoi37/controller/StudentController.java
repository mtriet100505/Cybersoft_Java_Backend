package com.cybersoft.homework_jpa_buoi37.controller;

import com.cybersoft.homework_jpa_buoi37.entity.Student;
import com.cybersoft.homework_jpa_buoi37.repository.StudentRepository;
import com.cybersoft.homework_jpa_buoi37.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = studentService.addStudent(student);
        return ResponseEntity.ok(newStudent);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/name")
    public ResponseEntity<?> getStudentByName(@RequestParam String name) {
        Optional<List<Student>> optionalStudents = studentService.findStudentsByName(name);
        if (optionalStudents.isPresent() && !optionalStudents.get().isEmpty()) {
            return ResponseEntity.ok(optionalStudents.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No student found with name " + name);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable Long id) {
        if (studentRepository.existsById(id)) {
            studentService.deleteStudentById(id);
            return ResponseEntity.ok("Student with id " + id + " has been deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with id " + id + " does not exist");
        }
    }

}
