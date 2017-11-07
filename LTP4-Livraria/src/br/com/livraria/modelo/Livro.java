package br.com.livraria.modelo;

public class Livro {
	private int idlivro;
	
	private String nome;
	
	private String isnb;
	
	private double preco;
	
	private String autor;
	
	public int getIdlivro() {
		return idlivro;
	}
	public void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIsnb() {
		return isnb;
	}
	public void setIsnb(String isnb) {
		this.isnb = isnb;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
