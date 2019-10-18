package com.virtusa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.dao.RoomDao;
@WebServlet("/AddRoom")
public class addrooms extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>AddRoomForm</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navorganizer.html").include(request, response);
		
		out.println("<div class='container'>");
		String RoomId=request.getParameter("RoomId");
		String RoomType=request.getParameter("RoomType");
		int capacity=Integer.parseInt(capacity);
		BookBean bean=new BookBean(RoomId,RoomType,capacity);
		int i=RoomDao.save(bean);
		if(i>0){
			out.println("<h3>Room added successfully</h3>");
		}
		request.getRequestDispatcher("addroomform.html").include(request, response);
		out.println("</div>");
		
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
	}

}
