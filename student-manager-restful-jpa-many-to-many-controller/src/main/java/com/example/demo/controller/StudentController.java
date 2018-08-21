package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CourseDAO;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StudentService studentServiceImpl;
	
	@Autowired
	private CourseDAO courseDAOImpl;
	@GetMapping("students")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> list = studentServiceImpl.findAllStudent();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	@GetMapping("student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id){
		Student student = studentServiceImpl.findStudentById(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	@PostMapping("student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
//		student.setCourses(student.getCourses());
//		student.setCourses((Set<Course>) courseDAOImpl.saveAll(student.getCourses()));
		studentServiceImpl.addStudent(student);
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	}
	@PutMapping("student")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		studentServiceImpl.updateStudent(student);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	@DeleteMapping("student/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer id) {
		studentServiceImpl.deleteStudent(id);
		return new ResponseEntity<String>("Deleted!",HttpStatus.NO_CONTENT);
	}
}
