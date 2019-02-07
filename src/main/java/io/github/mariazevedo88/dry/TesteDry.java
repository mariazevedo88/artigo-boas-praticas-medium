package io.github.mariazevedo88.dry;

import org.apache.log4j.Logger;

/**
 * Classe de teste Dry
 * 
 * @author Mariana Azevedo
 * @since 06/02/2019
 *
 */
public class TesteDry {
	
	private static final Logger logger = Logger.getLogger(TesteDry.class);

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(500);
		
		logger.info("Saldo apos deposito: " + contaCorrente.getSaldo());
		
		contaCorrente.rende();
		
		logger.info("Saldo apos rendimentos: " + contaCorrente.getSaldo());
		
		ContaSalario contaSalario = new ContaSalario();
		contaSalario.setTipoConta("Salario");
		
		contaSalario.deposita(3500);
		logger.info("Tipo Conta - " + contaSalario.getTipoConta() + ". Saldo apos deposito: " + contaSalario.getSaldo());

		contaSalario.saca(680);
		logger.info("Tipo Conta - " + contaSalario.getTipoConta() + ". Saldo apos saque: " + contaSalario.getSaldo());
	}

}
