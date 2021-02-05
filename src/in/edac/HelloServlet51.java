package in.edac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet5
 */
@WebServlet("/hello-servlet-51")
public class HelloServlet51 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> list = (List<String>) request.getAttribute("list");
		
		PrintWriter out = response.getWriter();
		
		for(String str : list) {
			out.println(str);
		}
		
		
	}

}
