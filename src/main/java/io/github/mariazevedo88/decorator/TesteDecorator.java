package io.github.mariazevedo88.decorator;

import io.github.mariazevedo88.builder.Produto;
import io.github.mariazevedo88.builder.Venda;
import io.github.mariazevedo88.builder.VendaBuilder;

public class TesteDecorator {

	public static void main(String[] args) {
		
		Desconto descontos = new TarifaAdministrativa(new MDR());
        
		Venda venda = new VendaBuilder().paraComprador("Mariana")
                .comDocumento("123456789")
                .comProduto(new Produto("Playstation 4", 1500.0))
                .comProduto(new Produto("TV 40'", 1000.0))
                .naDataAtual()
                .constroi();
		
        System.out.println(descontos.calcula(venda));
	}

}
