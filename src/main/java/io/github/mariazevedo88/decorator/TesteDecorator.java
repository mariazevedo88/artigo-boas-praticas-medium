package io.github.mariazevedo88.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.mariazevedo88.builder.Produto;
import io.github.mariazevedo88.builder.Venda;
import io.github.mariazevedo88.builder.VendaBuilder;

/**
 * Classe de teste de um Decorator
 * 
 * @author Mariana Azevedo
 * @since 04/02/2019
 *
 */
public class TesteDecorator {

	private static final Logger logger = LogManager.getLogger(TesteDecorator.class);
			
	public static void main(String[] args) {
		
		Desconto descontos = new TarifaAdministrativa(new MDR());
        
		Venda venda = new VendaBuilder().paraComprador("Mariana")
                .comDocumento("123456789")
                .comProduto(new Produto("Playstation 4", 1500.0))
                .comProduto(new Produto("TV 40'", 1000.0))
                .naDataAtual()
                .constroi();
		
		logger.info(descontos.calcula(venda));
	}

}
