package com.example.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDAO.getOne(id);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student student1= new Student();
		student1.setStudent_name(student.getStudent_name());
		student1.setStudent_address(student.getStudent_address());
		student1.setCourses(student.getCourses());
		studentDAO.save(student1);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentDAO.deleteById(id);
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.save(student);
	}

	@Override
	public Set<Student> addRegister(Student student, Set<Course> courses) {
		// TODO Auto-generated method stub
		return null;
	}

}
