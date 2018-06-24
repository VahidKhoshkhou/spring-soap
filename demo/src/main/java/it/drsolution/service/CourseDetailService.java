package it.drsolution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.drsolution.courses.CourseDetails;
import it.drsolution.model.Course;
import it.drsolution.repository.CourseRepository;


@Service
public class CourseDetailService {
	@Autowired
	private CourseRepository courseRepository;
	
	
	public CourseDetails findCourseDetailsById(int id) {	
		return mapCourseToCourseDetails( courseRepository.getCourseById(id));
	}
	
	public CourseDetails mapCourseToCourseDetails(Course course) {
		return new CourseDetails(course.getId(), course.getName(), course.getDescription());
	}

}
