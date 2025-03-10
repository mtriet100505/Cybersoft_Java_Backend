package com.cybersoft.homework_jpa_buoi37.repository;

import com.cybersoft.homework_jpa_buoi37.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<List<Student>> findByName(String name);
}
