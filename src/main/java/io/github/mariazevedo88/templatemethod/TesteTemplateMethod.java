package io.github.mariazevedo88.templatemethod;

import java.util.Arrays;
import java.util.List;

import io.github.mariazevedo88.builder.Produto;
import io.github.mariazevedo88.builder.Venda;
import io.github.mariazevedo88.builder.VendaBuilder;

/**
 * Classe de teste de um Template Method
 * 
 * @author Mariana Azevedo
 * @since 06/02/2019
 *
 */
public class TesteTemplateMethod {

	public static void main(String[] args) {
		
		Venda venda1 = new VendaBuilder().paraComprador("Mariana")
                .comDocumento("123456789")
                .comProduto(new Produto("Playstation 4", 1500.0))
                .comProduto(new Produto("TV 40'", 1000.0))
                .naDataAtual()
                .constroi();
		
		Venda venda2 = new VendaBuilder().paraComprador("Mariana")
                .comDocumento("0102030405")
                .comProduto(new Produto("Moto Z", 1800.0))
                .comProduto(new Produto("TV 40'", 1000.0))
                .naDataAtual()
                .constroi();
		
		List<Venda> vendas = Arrays.asList(venda1, venda2);

		RelatorioDeVendasTrimestral relatorio = new RelatorioDeVendasTrimestral();
		relatorio.geraRelatorio(vendas);
	}

}
