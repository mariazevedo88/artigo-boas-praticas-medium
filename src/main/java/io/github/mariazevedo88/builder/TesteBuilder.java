package io.github.mariazevedo88.builder;

/**
 * Classe de teste do Builder
 * 
 * @author Mariana Azevedo
 * @since 03/02/2019
 *
 */
public class TesteBuilder {

	public static void main(String[] args) {
		Venda venda = new VendaBuilder().paraComprador("Mariana")
                .comDocumento("123456789")
                .comProduto(new Produto("Playstation 4", 1500.0))
                .comProduto(new Produto("TV 40'", 1000.0))
                .naDataAtual()
                .constroi();
		
		System.out.println(venda);
	}
}
