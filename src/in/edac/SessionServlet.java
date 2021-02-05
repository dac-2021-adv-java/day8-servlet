package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/session-servlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// session -implicit object
		HttpSession session =  request.getSession();
		
		
		int counter = 1;
		if(session.getAttribute("counter") != null) {
			counter = (Integer) session.getAttribute("counter");
			
			counter = counter + 1;
			session.setAttribute("counter", counter);
		} else {
			session.setAttribute("counter", 1);
		}
		
		PrintWriter out = response.getWriter();
		out.println("Page Visit " +  counter);
	}

}
