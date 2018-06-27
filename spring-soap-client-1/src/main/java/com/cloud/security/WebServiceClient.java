package com.cloud.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import it.drsolution.wsdl.CourseDetails;
import it.drsolution.wsdl.GetCourseDetailsRequest;
import it.drsolution.wsdl.GetCourseDetailsResponse;
import it.drsolution.wsdl.ObjectFactory;


@Component
public class WebServiceClient {

    

    @Autowired
    private WebServiceTemplate webServiceTemplate;

   
    public CourseDetails getBook(int id) {
        
        ObjectFactory factory = new ObjectFactory();        
        GetCourseDetailsRequest req = factory.createGetCourseDetailsRequest();
        req.setId(id);
        GetCourseDetailsResponse resp = (GetCourseDetailsResponse) webServiceTemplate.marshalSendAndReceive(req);

        
        return resp.getCourseDetails();
    }

}
