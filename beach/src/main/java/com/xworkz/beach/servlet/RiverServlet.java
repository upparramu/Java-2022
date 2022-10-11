package com.xworkz.beach.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 9, urlPatterns = "/captainAmerica")
public class RiverServlet extends HttpServlet {
	
	public RiverServlet() {
		System.out.println("This is the default czonstructor of BeachServlet");
	}
	
  @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running service in RiverServlet");
	resp.setContentType("text/html");
	PrintWriter a=resp.getWriter();
	a.append("<html><body bgcolor='Black'><h1 style='color:white'>Edu Back Color Maga</h1></html></body>");
	

}

}
