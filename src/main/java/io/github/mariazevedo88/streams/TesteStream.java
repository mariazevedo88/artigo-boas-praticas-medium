package io.github.mariazevedo88.streams;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.mariazevedo88.builder.Venda;

/**
 * Classe de teste do Stream
 * 
 * @author Mariana Azevedo
 * @since 06/02/2019
 *
 */
public class TesteStream {
	
	static final Logger logger = LogManager.getLogger(TesteStream.class);

	public static void main(String[] args) {

		List<Venda> vendasDoDia = processaVendasDoDia();

	    //Vendas do dia com apenas uma parcela
	    vendasDoDia.stream().filter(venda -> venda.getNumeroParcelas() == 1).forEach(logger::info);
    }
		  
	private static List<Venda> processaVendasDoDia(){
		
		Venda venda1 = new Venda("Paulo", "26584992", Instant.now(), 6); //comprador, numero de parcelas
		Venda venda2 = new Venda("Lucas", "11112532", Instant.now(), 1);
		Venda venda3 = new Venda("Leila", "69854753", Instant.now(), 3);
		Venda venda4 = new Venda("Mariana", "33254789", Instant.now(), 10);
		
		return Arrays.asList(venda1, venda2, venda3, venda4);

	}

}

