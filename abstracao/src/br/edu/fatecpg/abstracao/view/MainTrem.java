package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Trem;

public class MainTrem {

	public static void main(String[] args) {
        Trem trem = new Trem("Bullet Train", 500, 320);
        trem.exibirInformacoes();
        trem.partir();
        trem.parar();
    }

}
