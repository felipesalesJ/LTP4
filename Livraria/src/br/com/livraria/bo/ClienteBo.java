package br.com.livraria.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.livraria.dao.ClienteDao;
import br.com.livraria.modelo.Cliente;

public class ClienteBo {
	
	static ClienteDao dao = new ClienteDao();
	
	public boolean criar(Cliente cliente) throws SQLException{
		return dao.create(cliente);
	}
	
	public static List<Cliente> listarTodos(){
		return dao.listarTodos();
	}
	
	public static Cliente buscaClienteId(Integer idcliente) throws SQLException{
		return dao.buscarId(idcliente);	
	}
	
	public static void alterar(Cliente cliente) throws SQLException {
		dao.update(cliente);
	}
	
	public static void deleta(Cliente cliente) throws SQLException {
		dao.delete(cliente);
	}
}
