package com.cloud.security;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import it.drsolution.wsdl.CourseDetails;

@Component
public class CourseCommandLineRunner  {

   

    @Autowired
    private WebServiceClient courseSvcClient;

    @Scheduled(fixedDelay=1000)
    public void run() throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {

                String text = scanner.nextLine();

                String[] args = text.split("\\s+");
             
                    int id = Integer.parseInt(args[0]);
                    CourseDetails courseDetails = courseSvcClient.getBook(id);
                    System.out.println(courseDetails.getName()+" : "+courseDetails.getDescription());           

            }
          }catch(Exception ex) {
        	  System.err.println(ex.getMessage());
          }
            
        }
    
}