package br.com.livraria.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.livraria.modelo.Cliente;
import br.com.livraria.bo.ClienteBo;


public class ClienteServlet extends HttpServlet{

	private String acao;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		acao = req.getParameter("acao");
		Cliente cliente = new Cliente();
		ClienteBo clienteBo = new ClienteBo();
		
		switch("acao"){
			case "Create":
				System.out.println();
				
				break;
			case "Read":
				System.out.println();
				break;
			case "ReadAll":
				System.out.println();
				break;
			case "Update":
				System.out.println();
				break;
			case "Delete":
				System.out.println();
				break;
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
	}
}
