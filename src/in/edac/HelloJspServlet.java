package in.edac;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloJspServlet
 */
@WebServlet("/hello-jsp-servlet")
public class HelloJspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ...
		// ...
		// ...
		request.setAttribute("project", "Project EDAC");

		// After all business logic
		request.getRequestDispatcher("1.jsp").forward(request, response);
		return;
	}

}
