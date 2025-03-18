package com.vishnu.core.servlets;

import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;


import org.osgi.service.component.annotations.Component;


import javax.servlet.Servlet;
import java.io.IOException;



@Component(service = Servlet.class,
           property = {
               "sling.servlet.methods=GET",  // This is a GET request servlet
               "sling.servlet.paths=/bin/simpleServlet"  // URL path to access the servlet
           })
public class SimpleServlet2 extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        // Setting content type of the response
        response.setContentType("text/html");
        
        // Write the response
        response.getWriter().write("<html><body><h1>Hello, this is a simple servlet!</h1></body></html>");
    }
}
