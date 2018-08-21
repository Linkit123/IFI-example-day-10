package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDAO;
import com.example.demo.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDAO courseDAOImpl;
	
	@Override
	public List<Course> findAllCourse() {
		// TODO Auto-generated method stub
		return courseDAOImpl.findAll();
	}

	@Override
	public Course findCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

}
