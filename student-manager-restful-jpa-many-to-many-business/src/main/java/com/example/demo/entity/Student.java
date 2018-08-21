package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="student")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int student_id;
	
	@Column(name="student_name")
	private String student_name;
	
	@Column(name="student_address")
	private String student_address;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course", joinColumns=@JoinColumn(name="student_id",referencedColumnName="student_id"), inverseJoinColumns=@JoinColumn(name="course_id",referencedColumnName="course_id"))
	private Set<Course> courses;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	@JsonIgnore
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public Student(String student_name, String student_address, Set<Course> courses) {
		super();
		this.student_name = student_name;
		this.student_address = student_address;
		this.courses = courses;
	}
	public Student(String student_name, String student_address) {
		super();
		this.student_name = student_name;
		this.student_address = student_address;
	}
	public Student() {
		super();
	}
	@Override
    public String toString() {
        String result = String.format(
                "----Student [id=%d, name='%s',address='%s']----%n",
                student_id, student_name,student_address);
        if (courses != null) {
            for(Course course : courses) {
                result += String.format(
                        "Cource[id=%d, name='%s']%n",
                        course.getCourse_id(), course.getCourse_name());
            }
        }
        return result;
    }
}
