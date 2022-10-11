package com.xworkz.beach.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 5, urlPatterns = "/thor")
public class BeachServlet extends HttpServlet {
	
	public BeachServlet() {
		System.out.println("This is the default constructor of BeachServlet");
	}
	
  @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running service in BeachServlet");
	resp.setContentType("text/html");
	PrintWriter a=resp.getWriter();
	a.append("<html><body bgcolor='yellow'><h1>Edu Yellow Color Maga</h1></body></html>");
	

}
     
}
