package br.com.livraria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.livraria.modelo.Livro;
import br.com.livraria.modelo.Cliente;
import br.com.livraria.conexao.Conexao;
import br.com.livraria.modelo.Venda;
import br.com.livraria.modelo.Livro;

public class VendaDao {
	private Venda venda = new Venda();
	
	public boolean create(Venda venda) throws SQLException{
		try{
			Connection cnx = Conexao.getConnection();
			if(cnx != null){
				PreparedStatement prepStat = cnx.prepareStatement("Insert into venda(id, idlivro) value (?,?)");
				prepStat.setInt(1, venda.getCliente().getId());
				prepStat.setInt(1, venda.getLivro().getIdlivro());
				prepStat.execute();
				prepStat.close();
				cnx.close();
				return true;
			}
		}catch(SQLException e){
			System.out.println("erro no dao");
			return false;
		}
		return false;
		
	}
	public static List<Livro> listarTodos(){
		List<Livro> lista = new ArrayList<Livro>();
		try{
			Connection cnx = Conexao.getConnection();
			Venda venda = null;
			Cliente cliente = null;
			Livro livro = null;
			PreparedStatement prepStat = cnx.prepareStatement("SELECT v.idVenda ,c.nome, c.email, c.sexo, c.cpf, car.nome, car.preco, v.descricao FROM venda v "
					+ "JOIN cliente c ON c.id = v.Cliente_id  "
					+ "JOIN carro car ON v.carro_id = car.id ORDER BY c.nome, car.nome");
			ResultSet resultSet = prepStat.executeQuery();
			
		}catch(SQLException e){
			System.out.println("erro no dao");
		}
		
		return lista;
	}
	
	
	public void delete(Venda venda) throws SQLException{
		try{
			Connection cnx = Conexao.getConnection();
			PreparedStatement prepStat = cnx.prepareStatement("Delete venda where idvenda = ?");
			prepStat.setInt(1, idvenda);
			prepStat.execute();
			prepStat.close();
			cnx.close();
		}catch(SQLException e){
			System.out.println("erro no dao");
		}		
	}
}