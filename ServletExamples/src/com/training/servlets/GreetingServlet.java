package com.training.servlets;
import com.Login;

import java.io.*;
import java.util.logging.Logger;

import javax.servlet.*;
import javax.servlet.http.*;




/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Logger log=Logger.getLogger(this.getClass().getName());
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        log.info("== Constructor Called==");
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    
			log.info("Vendor-Request object :"+request.getClass().toString());
			log.info("Vendor-Response object :"+response.getClass().toString());
			PrintWriter out =response.getWriter();
			response.setContentType("text/html");
			
			String user=request.getParameter("name");
			String password=request.getParameter("passkey");
			String role=request.getParameter("role");
			Login login = new Login();
		    boolean check=login.isUser(user,password);
		    System.out.println(check);
		    out.println("<HTML><HEAD><TITLE>");
			out.println("Greetings");
			out.println("</TITLE></HEAD><BODY>");
			if(check)
			out.print("welcome "+role +" : "+user);
			else
			out.print("Wrong user ");
			//out.println("<H1 stle='text-align:center'>Welcome to the world of servlet.</h1>");
			out.println("</BODY></HTML>");
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
