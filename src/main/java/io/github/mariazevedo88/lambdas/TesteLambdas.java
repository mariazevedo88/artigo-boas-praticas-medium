package io.github.mariazevedo88.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

import io.github.mariazevedo88.builder.Produto;
import io.github.mariazevedo88.builder.Venda;
import io.github.mariazevedo88.builder.VendaBuilder;

public class TesteLambdas {
	
	private static final Logger logger = Logger.getLogger(TesteLambdas.class);

	public static void main(String[] args) {
		
		List<Venda> vendas = populaVendas();
		
		Comparator<Venda> comparador = (venda1, venda2) -> {
		    return Double.compare(venda1.getValorBruto(), venda2.getValorBruto()); 
		};
		
		//Ordena em ordem crescente
		vendas.sort(comparador);
		logger.info(vendas);
		
		//Ordena em ordem decrescente
		vendas.sort(comparador.reversed());
		logger.info(vendas);
	}
	
	private static List<Venda> populaVendas() {
		
		Venda venda1 = new VendaBuilder().paraComprador("Mariana").comProduto(new Produto("Playstation 4", 1500.0))
                .comProduto(new Produto("TV 40'", 1000.0)).naDataAtual().constroi();
		
		Venda venda2 = new VendaBuilder().paraComprador("Lucas").comProduto(new Produto("Moto Z", 1800.0))
                .comProduto(new Produto("TV 40'", 1000.0)).naDataAtual().constroi();
		
		Venda venda3 = new VendaBuilder().paraComprador("Daniela").comProduto(new Produto("Monitor Dell 22'", 760.20))
                .naDataAtual().constroi();
		
		return Arrays.asList(venda1, venda2, venda3);
	}

}
