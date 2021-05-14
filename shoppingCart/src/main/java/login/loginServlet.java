package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import sun.awt.RepaintArea;

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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		String check=request.getParameter("check_code");
		String savecode=(String) request.getSession().getAttribute("check_code");
		PrintWriter pw=response.getWriter();
		if(("liuql").equals(name)&&("123").equals(pass)&&check.equals(savecode)) {
			User user=new User();
			user.setUsername(name);
			user.setPassword(pass);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("/shoppingCart/IndexServlet");
			
		}else if(check.equals(savecode)){
			pw.print("用户名或密码错误，登入失败！");
			
		}
		else {
			pw.print("验证码错误！");
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
