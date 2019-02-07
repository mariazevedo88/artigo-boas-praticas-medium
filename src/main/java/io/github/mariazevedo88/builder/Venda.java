package io.github.mariazevedo88.builder;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de apoio ao builder, que representa uma Venda
 * 
 * @author Mariana Azevedo
 * @since 03/02/2019
 *
 */
public class Venda {

	private String comprador;
    private String documentoComprador;
    private Instant dataDaVenda;
    private double valorBruto;
    private double valorLiquido;
    private double descontos;
    
    private Integer numeroParcelas;
    
    private List<Produto> produtos = new ArrayList<>();
    
	public Venda(String comprador, String documentoComprador, Instant dataDaVenda, double valorBruto,
			double valorLiquido, double descontos, List<Produto> produtos) {
		
		this.comprador = comprador;
		this.documentoComprador = documentoComprador;
		this.dataDaVenda = dataDaVenda;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.descontos = descontos;
		this.produtos = produtos;
	}
	
	public Venda(String comprador, String documentoComprador, Instant dataDaVenda, Integer numeroParcelas) {
		this.comprador = comprador;
		this.documentoComprador = documentoComprador;
		this.dataDaVenda = dataDaVenda;
		this.numeroParcelas = numeroParcelas;
	}
	
	public Venda(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	
	public String getComprador() {
		return comprador;
	}
	
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	
	public String getDocumentoComprador() {
		return documentoComprador;
	}
	
	public void setDocumentoComprador(String documentoComprador) {
		this.documentoComprador = documentoComprador;
	}
	
	public Instant getDataDaVenda() {
		return dataDaVenda;
	}
	
	public void setDataDaVenda(Instant dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}
	
	public double getValorBruto() {
		return valorBruto;
	}
	
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	
	public double getValorLiquido() {
		return valorLiquido;
	}
	
	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	
	public double getDescontos() {
		return descontos;
	}
	
	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	/**
	 * Metodo que soma o valor de todos os produtos da venda
	 * @author Mariana Azevedo
	 * @since 04/02/2019
	 * 
	 * @return
	 */
	public double getValorTotal() {
		return this.produtos.stream().map(produto -> produto.getValor()).reduce(0d, Double::sum);
	}

	@Override
	public String toString() {
		return "Venda [comprador=" + comprador + ", documentoComprador=" + documentoComprador + ", dataDaVenda="
				+ dataDaVenda + ", valorBruto=" + valorBruto + ", valorLiquido=" + valorLiquido + ", descontos="
				+ descontos + ", produtos=" + produtos + "]";
	}
	
}
