package com.xworkz.beach.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 8, urlPatterns = "/hulk")
public class WaterServlet extends HttpServlet {
	
	public WaterServlet() {
		System.out.println("Default constructor of WaterServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in WaterServlet");
		resp.setContentType("text/html");
		PrintWriter a=resp.getWriter();
		a.append("<html><body bgcolor='Red'><h1>Edu Red Color Maga</h1></html></body>");
	}
	
	

}
