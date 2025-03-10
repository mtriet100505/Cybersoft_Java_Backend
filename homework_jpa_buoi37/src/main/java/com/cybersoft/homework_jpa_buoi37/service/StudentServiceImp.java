package com.cybersoft.homework_jpa_buoi37.service;

import com.cybersoft.homework_jpa_buoi37.entity.Student;
import com.cybersoft.homework_jpa_buoi37.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student addStudent(Student student) {
        Student newStudent = new Student();
        newStudent.setName(student.getName());
        newStudent.setEmail(student.getEmail());
        newStudent.setAge(student.getAge());
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<List<Student>> findStudentsByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public void deleteStudentById(Long id) {
       studentRepository.deleteById(id);
    }
}
