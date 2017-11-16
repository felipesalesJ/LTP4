package br.com.livraria.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import br.com.livraria.conexao.Conexao;
import br.com.livraria.modelo.Livro;

public class LivroDao {

//	private Livro livro = new Livro();
	
	public boolean create(Livro livro) throws SQLException{
		try{
			Connection cnx = Conexao.getConnection();
			if(cnx != null){
				PreparedStatement prepStat = cnx.prepareStatement("Insert into livro(nome, isnb, preco, autor ) value (?,?,?,?)");
				prepStat.setString(1, livro.getNome());
				prepStat.setString(1, livro.getIsnb());
				prepStat.setDouble(1, livro.getPreco());
				prepStat.setString(1, livro.getAutor());
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
			Livro livro = null;
			PreparedStatement prepStat = cnx.prepareStatement("Select nome, isnb, preco, autor from livro");
			ResultSet resultSet = prepStat.executeQuery();
			
		}catch(SQLException e){
			System.out.println("erro no dao");
		}
		
		return lista;
	}
	
	public static Livro buscarId(int idlivro) throws SQLException{
		Livro livro = null;
		try{
			Connection cnx = Conexao.getConnection();
			PreparedStatement prepStat = cnx.prepareStatement("Select idlivro, nome, isnb, preco, autor from livro where idlivro = ?");
			prepStat.setInt(1, idlivro);
			ResultSet resultSet = prepStat.executeQuery();
			while(resultSet.next()){
				livro = new Livro();
				livro.setIdlivro(resultSet.getInt("idlivro"));
				livro.setNome(resultSet.getString("nome"));
				livro.setIsnb(resultSet.getString("isnb"));
				livro.setPreco(resultSet.getDouble("preco"));
				livro.setAutor(resultSet.getString("autor"));
			}
			resultSet.close();
			prepStat.close();
			cnx.close();
			
		}catch(SQLException e){
			System.out.println("erro no dao");
		}
		return livro;
		
	}
	
	public boolean update(Livro livro) throws SQLException{
		try{
			Connection cnx = Conexao.getConnection();
			if(cnx != null){
				PreparedStatement prepStat = cnx.prepareStatement("Update into livro(nome, isnb, preco, autor ) value (?,?,?,?)");
				prepStat.setString(1, livro.getNome());
				prepStat.setString(1, livro.getIsnb());
				prepStat.setDouble(1, livro.getPreco());
				prepStat.setString(1, livro.getAutor());
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
	
	public void delete(Livro livro) throws SQLException{
		try{
			Connection cnx = Conexao.getConnection();
			PreparedStatement prepStat = cnx.prepareStatement("Delete livro where idlivro = ?");
			prepStat.setInt(1, livro.getIdlivro());
			prepStat.execute();
			prepStat.close();
			cnx.close();
		}catch(SQLException e){
			System.out.println("erro no dao");
		}		
	}
}
