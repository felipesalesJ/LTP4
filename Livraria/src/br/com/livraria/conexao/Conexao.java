package br.com.livraria.conexao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexao {

	public static Connection getConnection() throws SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=1234");
		}catch(Exception e){
			System.out.println("null");
		}
		return null;
	}
}
