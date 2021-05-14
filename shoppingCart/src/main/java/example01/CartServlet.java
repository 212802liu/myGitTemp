package example01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		List<book> cart=null;
		boolean purflag=true;
		HttpSession session=request.getSession(false);  //false代表如果httpsession不存在是，不创建新的
		if(session==null)
			purflag=false;
		else {
			cart=(List) session.getAttribute("cart");
			if(cart==null)
				purflag=false;
		}
		if(!purflag) {
			out.print("对不起，您还没有购买任何东西！<br/>");
		}
		else {
			out.print("您购买的书有:<br/>");
			double price=0;
			for(book abook:cart) {
				out.print(abook.getName()+"<br/>");
			}
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
