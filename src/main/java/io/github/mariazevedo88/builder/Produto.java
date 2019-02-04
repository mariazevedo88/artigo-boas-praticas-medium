package io.github.mariazevedo88.builder;

/**
 * Classe de apoio ao builder, que representa um Produto
 * 
 * @author Mariana Azevedo
 * @since 03/02/2019
 *
 */
public class Produto {

	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + "]";
	}
}
