package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Roteador;

public class MainRoteador {
	
	 public static void main(String[] args) {
	        Roteador roteador = new Roteador("TP-Link", 300, false);
	        roteador.ligarWifi();
	        roteador.mostrarInformacoes();
	        roteador.desligarWifi();
	    }

}
