package io.github.mariazevedo88.decorator;

import io.github.mariazevedo88.builder.Venda;

public abstract class Desconto {
	
    private final Desconto outroDesconto;
    
    public Desconto(Desconto outroDesconto) {
        this.outroDesconto = outroDesconto;
    }

    public Desconto() {
        outroDesconto = null;
    }

    protected double calculaOutroDesconto(Venda venda) {
        return (outroDesconto == null? 0 : outroDesconto.calcula(venda));
    }

    public abstract double calcula(Venda venda);

}
