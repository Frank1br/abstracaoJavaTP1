package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.TaxaJuros;

public class MainTaxaJuros {

	public static void main(String[] args) {
        TaxaJuros taxa = new TaxaJuros(1000, 5, 2);
        taxa.exibirDetalhesJuros();
        taxa.calcularJurosSimples();
        taxa.calcularJurosCompostos();
    }

}
