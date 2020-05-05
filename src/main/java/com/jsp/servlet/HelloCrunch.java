package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloCrunch extends HttpServlet{
	//doget method is designed to get response context from web resource 
	//by sending limited amount of input data, this response contains response header, response body. 
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        PrintWriter out = response.getWriter();
//        
//        out.println (
//                  "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
//                      "http://www.w3.org/TR/html4/loose.dtd\">\n" +
//                  "<html> \n" +
//                    "<head> \n" +
//                      "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
//                        "charset=ISO-8859-1\"> \n" +
//                      "<title> Crunchify.com JSP Servlet Example  </title> \n" +
//                    "</head> \n" +
//                    "<body> <div align='center'> \n" +
//                      "<style= \"font-size=\"12px\" color='black'\"" + "\">" +
//                        "Username: " + username + " <br> " + 
//                        "Password: " + password +
//                    "</font></body> \n" +
//                  "</html>" 
//                );      
        }
	
	//dopost method is designed to send unlimited amount of data along with the request to web resource. 
	@Override
	  protected void doPost(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username);
		//cache username and password at request level
		req.setAttribute("user", username);
		req.setAttribute("pass", password);
		
		List<String> books = Arrays.asList("Harry potter", "Percy Jackson", "The great gatsby", "goosebumps");
		for(String a: books) {
			System.out.println(a);
		}
//		String books = "Harry Potter";
		req.setAttribute("books", books);
		RequestDispatcher dis = req.getRequestDispatcher("display.jsp");
		//redirect:
		//initiates a new request to the given url, no data from request is saved
		//redirect doesn't work
		//res.sendRedirect("http://localhost:8080/jsptest/display.jsp");
		//forward:
		//the original request and response objects are transferred along with additional parameters if needed
		dis.forward(req, res);
		
		
	}
	
}
