package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Student;

public interface StdRepository extends JpaRepository<Student, String> {

}
