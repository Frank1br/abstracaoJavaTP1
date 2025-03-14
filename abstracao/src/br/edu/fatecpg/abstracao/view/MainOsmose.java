package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Osmose;

public class MainOsmose {

	public static void main(String[] args) {
        Osmose osmose = new Osmose("Difusão de água", "hipotônico", true);
        osmose.explicarProcesso();
        osmose.mostrarExemplo();
        osmose.verificarTransporte();
    }

}
