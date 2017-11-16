package br.com.livraria.modelo;

import br.com.livraria.modelo.Livro;
import br.com.livraria.modelo.Cliente;

public class Venda {

	private int idvenda;
	private Cliente cliente = new Cliente();
	private Livro livro = new Livro();
	
	public int getIdvenda() {
		return idvenda;
	}
	public void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
