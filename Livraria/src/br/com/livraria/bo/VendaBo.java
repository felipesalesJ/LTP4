package br.com.livraria.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.livraria.dao.VendaDao;
import br.com.livraria.modelo.Venda;

public class VendaBo {
	
	private VendaDao dao = new VendaDao();
	
	public void cadastrar(Venda venda) throws  SQLException {
		dao.create(venda);
	}

	public List<Venda> listar() throws SQLException {
		
		return dao.listarTodos();
	}

	public void excluir(int idVenda) throws SQLException {
		dao.delete(idVenda);
	}
	
	

}
