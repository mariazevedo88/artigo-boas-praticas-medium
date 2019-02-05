package io.github.mariazevedo88.decorator;

import io.github.mariazevedo88.builder.Venda;

public class TarifaAdministrativa extends Desconto {

	public TarifaAdministrativa(Desconto desconto) {
        super(desconto);
    }

    public TarifaAdministrativa() {
        super();
    }
    
	@Override
	public double calcula(Venda venda) {
		return venda.getValorTotal() * 0.1 - calculaOutroDesconto(venda);
	}

}
