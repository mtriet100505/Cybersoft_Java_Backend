package com.cybersoft.homework_jpa_buoi37.service;

import com.cybersoft.homework_jpa_buoi37.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student addStudent(Student student);
    List<Student>getAllStudents();
    Optional<List<Student>> findStudentsByName(String name);
    void deleteStudentById(Long id);
}
