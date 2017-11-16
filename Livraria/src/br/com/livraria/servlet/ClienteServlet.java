package br.com.livraria.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.livraria.modelo.Cliente;
import br.com.livraria.modelo.Livro;
import br.com.livraria.bo.ClienteBo;
import br.com.livraria.bo.LivroBo;


public class ClienteServlet extends HttpServlet{

	private String acao;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		acao = req.getParameter("acao");
		Cliente cliente = new Cliente();
		ClienteBo clienteBo = new ClienteBo();
		
		switch("acao"){
		case "CREATE":
			System.out.println();
			try{
				cliente.setNome(req.getParameter("nome"));
				cliente.setEmail(req.getParameter("email"));
				cliente.setCpf(req.getParameter("cpf"));
				resp.sendRedirect("/Livraria/cliente?acao=readAll");
			}catch(Exception e){
				System.out.println("error ao criar");
			}
			break;
			
		case "SEARCH":
			System.out.println();
			try{
				cliente = clienteBo.buscaClienteId(Integer.parseInt(req.getParameter("id")));
				req.setAttribute("cliente", cliente);
				req.getRequestDispatcher("cliente/alterarCliente.jsp").forward(req, resp);
			}catch(Exception e){
				System.out.println("error ao procurar");
			}
			break;
			
		case "ReadALL":
			System.out.println();
			try{
				List<Cliente> lista = ClienteBo.listarTodos();
				req.setAttribute("lista", lista);
				req.getRequestDispatcher("cliente/alterarCliente.jsp").forward(req, resp);
			}catch(Exception e){
				System.out.println("error ao listar");
			}
			break;
			
		case "UPDATE":
			System.out.println();
			try{
				cliente.setNome(req.getParameter("nome"));
				cliente.setEmail(req.getParameter("email"));
				cliente.setCpf(req.getParameter("cpf"));
				clienteBo.alterar(cliente);
				resp.sendRedirect("/Livraria/cliente?acao=readAll");
			}catch(Exception e){
				System.out.println("error no update");
			}
			break;
			
		case "DELETE":
			System.out.println();
			try {
				cliente = clienteBo.buscaClienteId(Integer.getInteger(req.getParameter("idcliente")));
				clienteBo.deleta(cliente);
				resp.sendRedirect("/Livraria/cliente?acao=readAll");
			} catch (Exception e) {
				System.out.println("error no delete");
			}
			break;
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
	}
}
