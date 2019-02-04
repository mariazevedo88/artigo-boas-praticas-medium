package io.github.mariazevedo88.builder;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que implementa um exemplo de um Builder
 * 
 * @author Mariana Azevedo
 * @since 03/02/2019
 *
 */
public class VendaBuilder {

	private String comprador;
    private String documentoComprador;
    private Instant dataDaVenda;
    private double valorBruto;
    private double valorLiquido;
    private double descontos;
  
    private List<Produto> todosProdutos = new ArrayList<>();

    public VendaBuilder paraComprador(String comprador) {
       this.comprador = comprador;
       return this; // retorno eu mesmo, o próprio builder, para que o cliente continue utilizando
    }

    public VendaBuilder comDocumento(String documentoComprador) {
       this.documentoComprador = documentoComprador;
       return this;
    }
      
    public VendaBuilder comProduto(Produto produto) {
       todosProdutos.add(produto);
       valorBruto += produto.getValor();
       descontos = 0.05;
       valorLiquido = valorBruto - descontos;
       return this;
    }
    
    public VendaBuilder naDataAtual() {
    	this.dataDaVenda = Instant.now();
    	return this;
    }
  
    public Venda constroi() {
       return new Venda(comprador, documentoComprador, dataDaVenda, valorBruto, valorLiquido, descontos, todosProdutos);
    }
}
