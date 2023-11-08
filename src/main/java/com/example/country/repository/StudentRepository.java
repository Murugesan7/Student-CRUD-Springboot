package com.example.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.country.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
