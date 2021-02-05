package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet4
 */
@WebServlet("/hello-servlet-4")
public class HelloServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Assignment :: Include Multiple Servlet
		// <jsp:include page='' />
		request.getRequestDispatcher("hello-servlet-41").include(request, response);
		
		String title = (String)request.getAttribute("title");
		
		
		PrintWriter out = response.getWriter();
		out.println("From Worker 41 " + title);
		
	}

}
