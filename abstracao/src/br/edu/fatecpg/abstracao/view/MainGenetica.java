package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Genetica;

public class MainGenetica {

	public static void main(String[] args) {
        Genetica genetica = new Genetica("ATCGGA", "Hereditariedade Humana", "Nenhuma");

        genetica.analisarSequenciaDNA();
        genetica.estudarHereditariedade();
        genetica.detectarMutacao("ATCGGC"); 
    }

}
