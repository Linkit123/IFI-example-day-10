package com.example.demo.service;

import java.util.List;
import java.util.Set;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

public interface StudentService {
	List<Student> findAllStudent();
	Student findStudentById(int id);
	void updateStudent(Student student);
	void deleteStudent(int id);
	Student addStudent(Student student);
	Set<Student> addRegister(Student student, Set<Course> courses);
}
