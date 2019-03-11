package com.phihung.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phihung.springjpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
