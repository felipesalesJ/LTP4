package br.com.livraria.modelo;

public class Cliente {
	private int idcliente;
	
	private String nome;
	
	private String email;
	
	private String cpf;
	
	public int getId() {
		return idcliente;
	}
	public void setId(int idcliente) {
		this.idcliente = idcliente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
