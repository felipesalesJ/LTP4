package br.com.livraria.bo;

import java.util.List;

import br.com.livraria.dao.LivroDao;
import br.com.livraria.modelo.Livro;

public class LivroBo {

	static LivroDao dao = new LivroDao();
	
	public static List<Livro> listarTodos(){
		return dao.listarTodos();
		
	}
}
