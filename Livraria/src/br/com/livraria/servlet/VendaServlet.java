package br.com.livraria.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.livraria.bo.LivroBo;
import br.com.livraria.bo.ClienteBo;
import br.com.livraria.bo.VendaBo;
import br.com.livraria.modelo.Cliente;
import br.com.livraria.modelo.Venda;
import br.com.livraria.modelo.Livro;

public class VendaServlet extends HttpServlet{

	private String acao;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		acao = req.getParameter("acao");
		LivroBo livroBo = new LivroBo();
		Livro livro = new Livro();
		ClienteBo clienteBo = new ClienteBo();
		Cliente cliente = new Cliente();
		VendaBo vendaBo = new  VendaBo();
		Venda venda = new Venda();
		
		if(acao.equals("VENDER")){
			System.out.println();
			try {

				List<Cliente> clientes;
				clientes = ClienteBo.listarTodos();
				req.setAttribute("clientes", clientes);
				
				List<Livro> livros;
				livros = livroBo.listarTodos();
				req.setAttribute("livros", livros);
				req.getRequestDispatcher("/venda/fazerVenda.jsp").forward(req, resp);
			} catch (Exception e) {
				req.getRequestDispatcher("/deuruim.jsp").forward(req, resp);
			}
			
		}else if(acao.equals("createVenda")){
			try{
				livro.setIdlivro(Integer.parseInt(req.getParameter("idLivro")));
				cliente.setId(Integer.parseInt(req.getParameter("idCliente")));
				venda.setCliente(cliente);
				venda.setLivro(livro);
				resp.sendRedirect("/Livraria/venda?acao=Listar");
			} catch (Exception e) {
				req.getRequestDispatcher("deuruim.jsp").forward(req, resp);
			}
			
		} else if(acao.equals("ReadALL")){
			try {
				List<Venda> vendas = vendaBo.listar();
				
				
				req.setAttribute("vendas", vendas);
				req.getRequestDispatcher("/venda/listarVendas.jsp").forward(req, resp);
				
			} catch (SQLException e) {
				req.getRequestDispatcher("deuruim.jsp").forward(req, resp);
			}
			
		}else if(acao.equals("DELETE")) {
			try {
				int idVenda = Integer.parseInt(req.getParameter("id"));
				vendaBo.excluir(idVenda);
			} catch (SQLException e) {
				e.printStackTrace();
				req.getRequestDispatcher("deuruim.jsp").forward(req, resp);
			}
			resp.sendRedirect("/Livraria/venda?acao=Listar");
			
		} else {
			req.getRequestDispatcher("deuruimmesmo.jsp").forward(req, resp);
		}
		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		doPost(req, resp);
	}
}
