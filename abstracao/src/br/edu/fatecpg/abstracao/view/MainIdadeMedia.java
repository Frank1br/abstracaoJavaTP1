package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstacao.model.IdadeMedia;

public class MainIdadeMedia {

	public static void main(String[] args) {
        IdadeMedia idadeMedia = new IdadeMedia("Idade Média", 476, 1453);
        idadeMedia.descreverPeriodo();
        idadeMedia.mencionarEvento();
        idadeMedia.falarSobreCultura();
    }

}
