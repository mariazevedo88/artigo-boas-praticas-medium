package io.github.mariazevedo88.dry;

public class ContaSalario {
	
	private GerenciadorDeContas gerenciador;
	
	private String tipoConta;
	
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public ContaSalario() {
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
}
