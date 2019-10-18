package com.virtusa.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.dao.OrganizerDao;
@WebServlet("/OrganizerLogin")
public class organizerlogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>organizer Section</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		
		String email=request.getParameter("userName");
		String password=request.getParameter("password");
		if(OrganizerDao.authenticate(username, password)){
			HttpSession session=request.getSession();
			session.setAttribute("userName",username);
			
			request.getRequestDispatcher("navorganizer.html").include(request, response);
			request.getRequestDispatcher("organizercarousel.html").include(request, response);
			
		}else{
			request.getRequestDispatcher("navhome.html").include(request, response);
			out.println("<div class='container'>");
			out.println("<h3>Username or password error</h3>");
			request.getRequestDispatcher("organizerloginform.html").include(request, response);
			out.println("</div>");
		}
		
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}

}
