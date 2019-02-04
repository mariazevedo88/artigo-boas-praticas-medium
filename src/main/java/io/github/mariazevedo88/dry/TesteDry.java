package io.github.mariazevedo88.dry;

public class TesteDry {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(500);
		
		System.out.println("Saldo apos deposito: " + contaCorrente.getSaldo());
		
		contaCorrente.rende();
		
		System.out.println("Saldo apos rendimentos: " + contaCorrente.getSaldo());
		
		ContaSalario contaSalario = new ContaSalario();
		contaSalario.setTipoConta("Salario");
		
		contaSalario.deposita(3500);
		System.out.println("Tipo Conta - " + contaSalario.getTipoConta() + ". Saldo apos deposito: " + contaSalario.getSaldo());

		contaSalario.saca(680);
		System.out.println("Tipo Conta - " + contaSalario.getTipoConta() + ". Saldo apos saque: " + contaSalario.getSaldo());
	}

}
