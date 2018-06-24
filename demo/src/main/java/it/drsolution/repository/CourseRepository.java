package it.drsolution.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import it.drsolution.model.Course;

@Repository
public class CourseRepository {
  
	public List<Course> courses;

	public CourseRepository() {
		
		this.courses = Arrays.asList(
				new Course(1,"aaaa","bbbb"),
				new Course(2,"cccc","dddd"),
				new Course(3,"eeee","ffff"));
	}
	
	public List<Course> getCourses(){
		return courses;
	}
	
	public Course getCourseById(long id){
		return courses.stream()
				.filter(c-> c.getId()== id)
				.findFirst()
				.get();
	}
	
	
}
