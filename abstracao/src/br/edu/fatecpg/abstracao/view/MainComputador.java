package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Computador;

public class MainComputador {

	 public static void main(String[] args) {
	        Computador pc = new Computador("Dell", 16, 3.5);
	        pc.ligar();
	        pc.executarPrograma("Visual Studio Code");
	        pc.desligar();
	    }

}
