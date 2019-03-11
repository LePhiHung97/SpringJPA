package com.phihung.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.phihung.springjpa.model.Student;
import com.phihung.springjpa.repository.StudentRepository;

@Component
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Transactional
	public List<Student> getAllStudent() {
		return (List<Student>) studentRepository.findAll();
	}

	@Transactional
	public Student getById(int masv) {
		return studentRepository.findOne(masv);
	}

	@Transactional
	public void deleteStudent(Student student) {
		studentRepository.delete(student);
	}

	@Transactional
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Transactional
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
}
