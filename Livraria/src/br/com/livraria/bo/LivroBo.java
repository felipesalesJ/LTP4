package br.com.livraria.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.livraria.dao.LivroDao;
import br.com.livraria.modelo.Livro;

public class LivroBo {

	static LivroDao dao = new LivroDao();
	
	public boolean criar(Livro livro) throws SQLException{
		return dao.create(livro);
	}
	
	public static List<Livro> listarTodos(){
		return dao.listarTodos();
	}
	
	public static Livro buscaLivroId(Integer idlivro) throws SQLException{
		return dao.buscarId(idlivro);	
	}
	
	public static void alterar(Livro livro) throws SQLException {
		dao.update(livro);
	}
	
	public static void deleta(Livro livro) throws SQLException {
		dao.delete(livro);
	}
}
