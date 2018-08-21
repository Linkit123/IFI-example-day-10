package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;
public interface CourseService {
	List<Course> findAllCourse();
	Course findCourseById(int id);
	void updateCourse(Course course);
	void deleteCourse(int id);
	Course addCourse(Course course);
}
