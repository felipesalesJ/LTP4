package br.com.livraria.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.livraria.bo.LoginBo;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getSession(false) != null){
			req.getSession().invalidate();
		}
			resp.sendRedirect("../Livraria/index.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("acao").equals("logar")){
			String user = req.getParameter("user");
			String pass = req.getParameter("pass");
			if(LoginBo.verificarLogin(user, pass)){
				req.getSession().setAttribute("usuario", "user");
				req.getRequestDispatcher("menu.jsp").forward(req, resp);;
			}else{
					resp.sendRedirect("../Livraria/index.jsp");
			}
		}else{
				resp.sendRedirect("../Livraria/index.jsp");
		}
	}
}
