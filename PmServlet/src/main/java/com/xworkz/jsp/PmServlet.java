package com.xworkz.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/fasttrack")
public class PmServlet extends HttpServlet {

	
	public PmServlet() {
		System.out.println("inside PmServlet constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String name=req.getParameter("Name");
		String country=req.getParameter("Country");
		String marriage=req.getParameter("Marriage Status");
		String party=req.getParameter("Party");
		String age=req.getParameter("Age");
		String gender=req.getParameter("Gender");
		String period=req.getParameter("Period");
		String times=req.getParameter("Times");
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/pmdetails.jsp");
		dispatcher.forward(req, resp);
		
		
		
	}
	
	
}
















