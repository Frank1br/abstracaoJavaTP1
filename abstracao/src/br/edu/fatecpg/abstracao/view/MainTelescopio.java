package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Telescopio;

public class MainTelescopio {

	public static void main(String[] args) {
        Telescopio telescopio = new Telescopio("Refrator", 120, 300);
        telescopio.mostrarDetalhes();
        telescopio.observarEstrela("Sirius");
        telescopio.ajustarFoco();
    }

}
