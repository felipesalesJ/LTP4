package br.com.livraria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.livraria.conexao.Conexao;
import br.com.livraria.modelo.Cliente;
import br.com.livraria.modelo.Cliente;

public class ClienteDao {
	private Cliente cliente = new Cliente();
	
	public boolean create(Cliente cliente) throws SQLException{
		try{
			Connection cnx = Conexao.getConnection();
			if(cnx != null){
				PreparedStatement prepStat = cnx.prepareStatement("Insert into cliente(nome, isnb, preco, autor ) value (?,?,?,?)");
				prepStat.setString(1, cliente.getNome());
				prepStat.setString(1, cliente.getCpf());
				prepStat.setString(1, cliente.getEmail());
				prepStat.setInt(1, cliente.getId());
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
	public static List<Cliente> listarTodos(){
		List<Cliente> lista = new ArrayList<Cliente>();
		try{
			Connection cnx = Conexao.getConnection();
			Cliente cliente = null;
			PreparedStatement prepStat = cnx.prepareStatement("Select nome, isnb, preco, autor from cliente");
			ResultSet resultSet = prepStat.executeQuery();
			
		}catch(SQLException e){
			System.out.println("erro no dao");
		}
		
		return lista;
	}
	
	public static Cliente buscarId(int idcliente) throws SQLException{
		Cliente cliente = null;
		try{
			Connection cnx = Conexao.getConnection();
			PreparedStatement prepStat = cnx.prepareStatement("Select idcliente, nome, isnb, preco, autor from cliente where idcliente = ?");
			prepStat.setInt(1, idcliente);
			ResultSet resultSet = prepStat.executeQuery();
			while(resultSet.next()){
				cliente = new Cliente();
				cliente.setId(resultSet.getInt("idcliente"));
				cliente.setNome(resultSet.getString("nome"));
				cliente.setEmail(resultSet.getString("email"));
				cliente.setCpf(resultSet.getString("cpf"));
			}
			resultSet.close();
			prepStat.close();
			cnx.close();
			
		}catch(SQLException e){
			System.out.println("erro no dao");
		}
		return cliente;
		
	}
	
	public boolean update(Cliente cliente) throws SQLException{
		try{
			Connection cnx = Conexao.getConnection();
			if(cnx != null){
				PreparedStatement prepStat = cnx.prepareStatement("Update into cliente(nome, cpf, email ) value (?,?,?)");
				prepStat.setString(1, cliente.getNome());
				prepStat.setString(1, cliente.getCpf());
				prepStat.setString(1, cliente.getEmail());
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
	
	public void delete(Cliente cliente) throws SQLException{
		try{
			Connection cnx = Conexao.getConnection();
			PreparedStatement prepStat = cnx.prepareStatement("Delete cliente where id = ?");
			prepStat.setInt(1, cliente.getId());
			prepStat.execute();
			prepStat.close();
			cnx.close();
		}catch(SQLException e){
			System.out.println("erro no dao");
		}		
	}
}
