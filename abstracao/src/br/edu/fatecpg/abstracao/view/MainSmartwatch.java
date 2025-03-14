package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Smartwatch;

public class MainSmartwatch {

	 public static void main(String[] args) {
	        Smartwatch smartwatch = new Smartwatch("Apple", "Watch Series 8", true);
	        smartwatch.exibirHora();
	        smartwatch.monitorarBatimentos();
	        smartwatch.receberNotificacao("Mensagem do WhatsApp");
	    }

}
