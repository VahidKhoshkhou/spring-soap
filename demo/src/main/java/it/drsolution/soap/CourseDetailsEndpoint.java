package it.drsolution.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import it.drsolution.courses.GetCourseDetailsRequest;
import it.drsolution.courses.GetCourseDetailsResponse;
import it.drsolution.service.CourseDetailService;

@Endpoint
public class CourseDetailsEndpoint {
	
	@Autowired
	private CourseDetailService courseDetailService;
	
	@PayloadRoot(namespace="http://drsolution.it/courses",
			      localPart="GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetailsRequest
	       (@RequestPayload GetCourseDetailsRequest request) {
		GetCourseDetailsResponse response=new GetCourseDetailsResponse();	
		response.setCourseDetails(courseDetailService.findCourseDetailsById(request.getId()));
		return response;
	}
   
}
