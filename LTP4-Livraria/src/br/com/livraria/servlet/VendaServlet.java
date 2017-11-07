package br.com.livraria.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.livraria.modelo.Livro;
import br.com.livraria.bo.LivroBo;;


public class VendaServlet extends HttpServlet{

	private String acao;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		acao = req.getParameter("acao");
		Livro livro = new Livro();
		LivroBo livroBo = new LivroBo();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
	}
}
