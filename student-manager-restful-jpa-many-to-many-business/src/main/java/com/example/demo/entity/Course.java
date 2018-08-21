package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="course")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int course_id;
	
	@Column(name="course_name")
	private String course_name;

	@ManyToMany(mappedBy="courses")
	private Set<Student> students;
	
	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	@JsonIgnore
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Course(String course_name, Set<Student> students) {
		super();
		this.course_name = course_name;
		this.students = students;
	}

	public Course(String course_name) {
		super();
		this.course_name = course_name;
	}

	@Override
	public String toString() {
		return 
				"Course [course_id=" + course_id + ", course_name=" + course_name + ", students=" + students + "]";
	}

	public Course() {
		super();
	}
	
}
