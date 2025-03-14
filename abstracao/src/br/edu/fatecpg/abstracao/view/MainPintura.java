package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.Pintura;

public class MainPintura {

	public static void main(String[] args) {
        Pintura pintura = new Pintura("Leonardo da Vinci", "Mona Lisa", 1503);
        pintura.exibirInformacoes();
        pintura.restaurar();
        pintura.expor();
    }

}
