package example01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.group.Response;

/**
 * Servlet implementation class ListBookServlet
 */
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Collection<book> books=bookDB.getAll();
		out.print("本站提供的图书有：<br/>");
		for(book b:books) {
//			String url="/shoppingCart/PurchaseServlet?id="+abook.getId();
//			out.print(abook.getName()+"<a href='"+url+"'>点击购买<a/><br/>");
			String name=b.getName();
			String id=b.getId();
			String url="<a href='/shoppingCart/PurchaseServlet?id="+id+"'>点击购买<a/>";
			out.print("图书名称："+name+"  "+url+"<br/>");
		}
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
