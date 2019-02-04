package io.github.mariazevedo88.dry;

public class ContaCorrente {
	
	private GerenciadorDeContas gerenciador;
	
	public ContaCorrente() {
		this.gerenciador = new GerenciadorDeContas();
	}

	public void deposita(double valor) {
        this.gerenciador.deposita(valor);
    }
    
    public void saca(double valor) {
    	this.gerenciador.saca(valor);
    }

    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }

    public void rende() {
        this.gerenciador.rende(0.02);
    }
}
