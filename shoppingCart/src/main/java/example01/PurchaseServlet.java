package example01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.tomcat.util.http.parser.Cookie;

import java.util.*;
/**
 * Servlet implementation class PurchaseServlet
 */
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id=request.getParameter("id");
		if(id==null) {
			String url="/shoppingCart/ListBookServlet";
			response.sendRedirect(url);
			return;
		}
		book abook=bookDB.getBook(id);
		HttpSession session=request.getSession();
		List<book> cart=(List<book>) session.getAttribute("cart");
		if(cart==null) {
			cart =new ArrayList<book>();
			session.setAttribute("cart", cart);}
			cart.add(abook);
			//session 基于自己创建的cookie完成效果：在浏览器关闭后，cookie还存在，就能找到session对象
			//Cookie cookie=new Cookie("JSESSIONID",session.getId());
			Cookie cookie=new Cookie("JSESSIONID",session.getId());
			cookie.setMaxAge(60*60);
			cookie.setPath("/shoppingCart");
			response.addCookie(cookie);
			String url="/shoppingCart/CartServlet";
			response.sendRedirect(url);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
