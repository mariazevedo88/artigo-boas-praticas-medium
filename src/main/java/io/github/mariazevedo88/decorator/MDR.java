package io.github.mariazevedo88.decorator;

import io.github.mariazevedo88.builder.Venda;

public class MDR extends Desconto {

    public MDR(Desconto outroDesconto) {
        super(outroDesconto);
    }

    public MDR() {
        super();
    }

	@Override
	public double calcula(Venda venda) {
		return venda.getValorTotal() * 0.06 - calculaOutroDesconto(venda);
	}

}
