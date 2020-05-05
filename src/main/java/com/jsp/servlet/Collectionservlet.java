package com.jsp.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Collectionservlet extends HttpServlet{

	@Override
	  protected void doGet(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException {
		
		System.out.println("Collection");
//		List<String> books = Arrays.asList("Harry potter", "Percy Jackson", "The great gatsby", "goosebumps");
		 Map<Integer, String> books = new HashMap<Integer, String>();
//		for(String a: books) {
//			System.out.println(a);
//		}
//		String books = "Harry Potter";
		books.put(1, "Harry potter"); 
		books.put(2, "Percy Jackson"); 
		books.put(3, "The great gatsby"); 
		books.put(4, "Goosebumps"); 
		req.setAttribute("books", books);
		RequestDispatcher dis = req.getRequestDispatcher("coll.jsp");
		
		dis.forward(req, res);
		
	}
	@Override
	  protected void doPost(HttpServletRequest req, HttpServletResponse res)
	    throws IOException, ServletException {
		
	}
}
