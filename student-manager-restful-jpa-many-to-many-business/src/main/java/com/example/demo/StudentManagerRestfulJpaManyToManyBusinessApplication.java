package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@SpringBootApplication
public class StudentManagerRestfulJpaManyToManyBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagerRestfulJpaManyToManyBusinessApplication.class, args);
	}

	@Autowired
	private StudentService studentServiceImpl;
	
//	@Override
//	@Transactional
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		//add
//		Course course = new Course("English");
//		Course course1 = new Course("Japanese");
//		System.out.println("========================");
//		//add course
//		Set<Course> courses = new HashSet<Course>() {{
//			add(course);
//			add(course1);
//		}};
//		//add student
//		Student student= new Student("loc","hà nội",courses);
//		//
////		studentServiceImpl.addStudent(student);
//		
//		//update
//		Student student2 = studentServiceImpl.findStudentById(17);
//		student2.setStudent_address("hà nội");
//		Course course2 = new Course("Vietnamese");
//		Course course3 = new Course("Chinese");
//		Set<Course> courses1 = new HashSet<Course>() {{
//			add(course2);
//			add(course3);
//		}};
//		student2.setCourses(courses1);
////		studentServiceImpl.updateStudent(student2);
//		//delete
////		studentServiceImpl.deleteStudent(15);
//		System.out.println(studentServiceImpl.findAllStudent());		
//	}
}
