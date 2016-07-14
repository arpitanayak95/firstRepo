package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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
		
		HttpSession session =request.getSession(true);
		String firstname=request.getParameter("f_name");
		session.setAttribute("f_name", firstname);
		out.println(session.getAttribute("f_name"));
		out.println("<br>");
		out.println(session.getCreationTime());
		out.println(request.getLocalName());
		
		
		//out.println(session.getAttribute("l_name"));
		//Cookie ck=new Cookie("Nameck","valueck");
		//response.addCookie(ck);
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=SecondServlet method=post>");
		out.println("enter lastname");
		out.println("<input type=text name=l_name>");
		out.println("<br>");
		out.println("<input type=submit>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
