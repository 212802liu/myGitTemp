package cn.iycast.goOtherWay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludingServlet
 */
public class IncludingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		//response.setHeader("content-Type", "text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/IncludedServlet?p1=abc");
		out.print("before including"+"<br/>");
		rd.include(request, response);
		out.print("after inclided"+"<br/");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
