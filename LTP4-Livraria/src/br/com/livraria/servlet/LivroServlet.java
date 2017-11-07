package br.com.livraria.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.livraria.modelo.Livro;
import br.com.livraria.bo.LivroBo;;


public class LivroServlet extends HttpServlet{

	private String acao;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		acao = req.getParameter("acao");
		Livro livro = new Livro();
		LivroBo livroBo = new LivroBo();
		
		switch("acao"){
		case "create":
			System.out.println();
			try{
				livro.setNome(req.getParameter("nome"));
				livro.setIsnb(req.getParameter("isnb"));
				livro.setAutor(req.getParameter("autor"));
				livro.setPreco(Double.parseDouble("preco"));
			}catch(Exception e){
				System.out.println("error");
			}
			break;
			
		case "read":
			System.out.println();
			try{
				List<Livro> lista = LivroBo.listarTodos();
				req.getAttribute("lista");
			}catch(Exception e){
				System.out.println("error");
			}
			break;
			
		case "readAll":
			System.out.println();
			break;
			
		case "update":
			System.out.println();
			break;
			
		case "delete":
			System.out.println();
			break;
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
	}
}
