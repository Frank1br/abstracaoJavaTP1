package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Celula;

public class MainCelula {
	public static void main(String[] args) {
        Celula c = new Celula("Eucariótica", 100000, "Transporte de oxigênio");
        c.dividir();
        c.especializar();
        c.exibirInfo();
    }
}
