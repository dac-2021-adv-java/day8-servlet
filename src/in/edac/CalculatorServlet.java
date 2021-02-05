package in.edac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculator-servlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			
			int total = n1 + n2;
			out.println(num1 + " " + num2);
			out.println("Sum " + total );
			
		} catch(Exception e) {
			out.println("Exception Occured!!" + e.getMessage());
		}
		
	}

	

}
