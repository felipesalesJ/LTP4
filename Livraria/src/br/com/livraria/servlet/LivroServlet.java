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
		
		if (acao.equals("CREATE")) {
			System.out.println("CREATE");
			try{
				livro.setNome(req.getParameter("nome"));
				livro.setIsnb(req.getParameter("isnb"));
				livro.setAutor(req.getParameter("autor"));
				livro.setPreco(Double.parseDouble(req.getParameter("preco")));
				livro.setIdlivro(Integer.parseInt(req.getParameter("preco")));
				livroBo.criar(livro);
				resp.sendRedirect("/Livraria/livro?acao=ReadAll");
			}catch(Exception e){
				System.out.println("error ao criar");
				resp.sendRedirect("/Livraria/deuruim.jsp");
			}
			
		} else if (acao.equals("SEARCH")) {
			System.out.println("SEARCH");
			try{
				livro = livroBo.buscaLivroId(Integer.parseInt(req.getParameter("id")));
				req.setAttribute("livro", livro);
				req.getRequestDispatcher("livro/alterarLivro.jsp").forward(req, resp);
			}catch(Exception e){
				System.out.println("error ao procurar");
			}

		} else if (acao.equals("ReadALL")) {	
			System.out.println("ReadALL");
			try{
				List<Livro> lista = LivroBo.listarTodos();
				req.setAttribute("lista", lista);
				req.getRequestDispatcher("livro/alterarLivro.jsp").forward(req, resp);
			}catch(Exception e){
				System.out.println("error ao listar");
			}
			
		} else if (acao.equals("UPDATE")) {
			System.out.println("UPDATE");
			try{
				livro.setNome(req.getParameter("nome"));
				livro.setIsnb(req.getParameter("isnb"));
				livro.setAutor(req.getParameter("autor"));
				livro.setPreco(Double.parseDouble("preco"));
				livroBo.alterar(livro);
				resp.sendRedirect("/Livraria/livro?acao=readAll");
			}catch(Exception e){
				System.out.println("error no update");
			}
			
		} else if (acao.equals("DELETAR")) {	
			System.out.println("DELETAR");
			try {
				livro = livroBo.buscaLivroId(Integer.getInteger(req.getParameter("idlivro")));
				livroBo.deleta(livro);
				resp.sendRedirect("/Livraria/livro?acao=readAll");
			} catch (Exception e) {
				System.out.println("error no delete");
			}
			
		} else {	
			resp.sendRedirect("/Livraria/livro?acao=readAll");
			resp.sendRedirect("/Livraria/deuruimmesmo.jsp");
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
	}
}