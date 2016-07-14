package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//RequestDispatcher rd=request.getRequestDispatcher("ThirdServlet");
		//rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out=response.getWriter();
		HttpSession session =request.getSession(false);
		String lastname=request.getParameter("l_name");
		session.setAttribute("l_name", lastname);
		//session.setAttribute("l_name", "nayak");
		out.println(session.getAttribute("f_name"));
		out.println(session.getAttribute("l_name"));
	  
		out.println("<br>");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=ThirdServlet method=post>");
		out.println("enter qualification");

		out.println("<input type=text name=qualification>");
		out.println("<br>");
		out.println("<input type=submit>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		//public void HttpServletResponse.sendRedirect()
				//throws IOException 
		String site1="http://timesofindia.indiatimes.com/";
		response.setStatus(response.SC_NOT_FOUND);
		response.setHeader("Location", site1);
	}

}
