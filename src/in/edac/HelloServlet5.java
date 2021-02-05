package in.edac;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet5
 */
@WebServlet("/hello-servlet-5")
public class HelloServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> list = Arrays.asList("Delhi", "Kolkata");
		request.setAttribute("list", list);
		
		
		// forwarding the call...
		// <jsp:forward />
		request.getRequestDispatcher("hello-servlet-51").forward(request, response);
	}

}
