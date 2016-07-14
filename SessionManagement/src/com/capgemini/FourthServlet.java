package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FourthServlet
 */
@WebServlet("/FourthServlet")
public class FourthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FourthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out=response.getWriter();
		HttpSession session =request.getSession(false);
		String marks=request.getParameter("marks");
		session.setAttribute("marks", marks);
		//session.setAttribute("marks", "50");
		out.println(session.getAttribute("f_name"));

		out.println(session.getAttribute("l_name"));
		out.println(session.getAttribute("qualification"));
		out.println(session.getAttribute("marks"));
		out.println("<br>");
		String site = "http://www.google.com" ;
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", site); 
		//response.setStatus(response.SC_FOUND);
		
		
		
	}

}
