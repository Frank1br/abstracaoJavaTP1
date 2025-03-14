package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Cinema;

public class MainCinema {

	 public static void main(String[] args) {
	        Cinema cine = new Cinema("Shopping Center", "Oppenheimer", 25.0);
	        cine.assistirFilme();
	        cine.comprarIngresso();
	        cine.exibirInfo();
	    }

}
