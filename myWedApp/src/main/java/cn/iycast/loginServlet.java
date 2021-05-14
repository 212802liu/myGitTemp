package cn.iycast;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//headMethod(response);
		//refresh(response);
		
	}

	private void refresh(HttpServletResponse response) throws IOException {
		response.setHeader("Refresh", "3");
		response.getWriter().print(new Date().toString());
	}

	private void headMethod(HttpServletResponse response) {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setStatus(302);
		response.setHeader("Location", "/myWedApp/login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
