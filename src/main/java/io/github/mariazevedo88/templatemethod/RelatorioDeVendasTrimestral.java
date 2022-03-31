package io.github.mariazevedo88.templatemethod;

import java.time.Instant;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.mariazevedo88.builder.Venda;

public class RelatorioDeVendasTrimestral extends Relatorio {
	
	private static final Logger logger = LogManager.getLogger(RelatorioDeVendasTrimestral.class);

	@Override
	protected void cabecalho() {
		logger.info("Relatorio Trimestral");
	}

	@Override
	protected void rodape() {
		logger.info("Gerado em: " + Instant.now());

	}

	@Override
	protected void conteudo(List<Venda> vendas) {
		vendas.forEach(logger::info);
	}

}
