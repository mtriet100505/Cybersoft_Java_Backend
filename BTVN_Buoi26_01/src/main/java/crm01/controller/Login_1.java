package crm01.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="loginController", urlPatterns = {"/login"})
public class Login_1 extends HttpServlet {
	private static final long serialVersionUID=1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[]cookies=req.getCookies();
		String username="";
		String password="";
		boolean rememberMe=false;
		if(cookies!=null) {
			for(Cookie cookie:cookies) {
				switch (cookie.getName()) {
				case "username":
					username=cookie.getValue();
					rememberMe=true;
				break;
				case "password":
					password=cookie.getValue();
					break;
				}
			}
		}
		req.setAttribute("cookieUsername", username);
		req.setAttribute("cookiePassword", password);
		req.setAttribute("cookieRemberMe", rememberMe);
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String rememberMe=req.getParameter("rememberMe");
		if(username.equals("admin") && password.equals("123456")) {
			if(rememberMe.equals("on")) {
				Cookie ckUsername=new Cookie("username",username);
				Cookie ckPassword=new Cookie("password",password);
				ckUsername.setMaxAge(24*60*60);
				ckPassword.setMaxAge(24*60*60);
				resp.addCookie(ckUsername);
				resp.addCookie(ckPassword);
			}
		req.setAttribute("usernamme", username);
		req.getRequestDispatcher("welcome.jsp").forward(req, resp);
		}else {
			req.setAttribute("errorMessage", "Đăng nhập thất bại");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
